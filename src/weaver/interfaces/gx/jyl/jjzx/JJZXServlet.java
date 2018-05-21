package weaver.interfaces.gx.jyl.jjzx;

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
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCode;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Fundcenter;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet;
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
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class JJZXServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private JJZXPublicMethod publicmethod = new JJZXPublicMethod();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        int pageNo;
        String jjzxdm = Util.null2String(request.getParameter("jjzxdm"));
        String userid = Util.null2String(request.getParameter("userid"));
        String flag = Util.null2String(request.getParameter("flag"));
        String jjzxmc = Util.null2String(request.getParameter("jjzxmc"));
        String djbs = Util.null2String(request.getParameter("djbz"));
        String sqdh = Util.null2String(request.getParameter("sqdh"));
        String gsdm_search = Util.null2String(request.getParameter("gsdm"));
        String fwgx_search = Util.null2String(request.getParameter("fwgx"));
        String start = Util.null2String(request.getParameter("start"));
        int limit = getInt(Util.null2String(request.getParameter("limit")),20);
        if(!"".equals(start)){
            pageNo = getInt(start,0) / limit + 1;
        }else{
            pageNo = 1;
        }
        try {
            JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
            JSONArray jsonArray = new JSONArray();
            FundcenterQuery fundcenterQuery = new FundcenterQuery();
            FundcenterCriteria fundcenterCriteria = new FundcenterCriteria();
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
                fundcenterCriteria.setApplicant(textCriteria);
            }
            if(!"".equals(djbs)) {
                BooleanCriteria BooleanCriteria = new BooleanCriteria();
                BooleanConstraint[] BooleanConstraints = new BooleanConstraint[1];
                BooleanConstraint BooleanConstraint = new BooleanConstraint();
                if("false".equals(djbs)){
                    BooleanConstraint.setValue(false);
                }
                if("true".equals(djbs)){
                    BooleanConstraint.setValue(true);
                }
                BooleanConstraints[0] = BooleanConstraint;
                BooleanCriteria.setConstraint(BooleanConstraints);
                fundcenterCriteria.setLVOMA(BooleanCriteria);
            }
            //基金中心代码 查询条件
            if(!"".equals(jjzxdm)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(jjzxdm);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                fundcenterCriteria.setFICTR(textCriteria);
            }
            if(!"".equals(sqdh)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(sqdh);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                fundcenterCriteria.setApplyNumber(textCriteria);
            }
            //基金中心名称 查询条件
            if(!"".equals(jjzxmc)){
                TextCriteria textCriteria = new TextCriteria();
                TextConstraint[] textConstraints = new TextConstraint[1];
                TextConstraint textConstraint = new TextConstraint();
                textConstraint.setExpressionOperator("CONTAINS");
                textConstraint.setValue(jjzxmc);
                textConstraints[0] = textConstraint;
                textCriteria.setConstraint(textConstraints);
                fundcenterCriteria.setBEZEICH(textCriteria);
            }
            if(!"".equals(fwgx_search)){
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
                        fundcenterCriteria.setServiceRelationshipsTupleCLIENT_SYSTEM(PicklistCriteria);
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
            if(!"".equals(gsdm_search)){
                CompanyCodeQuery CompanyCodeQuery = new CompanyCodeQuery();
                CompanyCodeCriteria CompanyCodeCriteria = new CompanyCodeCriteria();
                CompanyCodeCriteria.setCode(publicmethod.setTextCriteria(gsdm_search));
                CompanyCodeQuery.setCriteria(CompanyCodeCriteria);
                CompanyCodeResultSet CompanyCodeResultSet = f.searchCompanyCode(CompanyCodeQuery, publicmethod.setReposInfo());
                if(null == CompanyCodeResultSet) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                } else {
                    CompanyCode[] CompanyCodes = CompanyCodeResultSet.getCompanyCode();
                    if(CompanyCodes.length == 0 || null == CompanyCodes) {
                        JSONObject jsonresult = new JSONObject();
                        jsonresult.put("totalcount", "0");
                        jsonresult.put("result", jsonArray);
                        response.setContentType("application/json; charset=utf-8");
                        response.getWriter().print(jsonresult.toString());
                        return;
                    } else{
                        PicklistCriteria PicklistCriteria = new PicklistCriteria();
                        PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                        PicklistConstraint PicklistConstraint = new PicklistConstraint();
                        PicklistConstraint.setExpressionOperator("EQUALS");
                        RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                        RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                        RecordIdentifierConstraint.setInternalID(CompanyCodes[0].getRecordIdentification().getInternalID());
                        RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                        PicklistConstraint.setValue(RecordIdentifierConstraints);
                        PicklistConstraints[0] = PicklistConstraint;
                        PicklistCriteria.setConstraint(PicklistConstraints);
                        fundcenterCriteria.setBUKRS(PicklistCriteria);
                    }
                }
            }
            fundcenterQuery.setCriteria(fundcenterCriteria);
            FundcenterResultSet fundcenterResultSet;
            try {
                fundcenterResultSet = f.searchFundcenter(fundcenterQuery, publicmethod.setReposInfo());
                Fundcenter[] fundcenters = fundcenterResultSet.getFundcenter();
                if(null == fundcenters) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    response.setContentType("application/json; charset=utf-8");
                    response.getWriter().print(jsonresult.toString());
                    return;
                }
                int begin = (pageNo * limit) - limit;
                int end = begin + limit;
                int endtotal = fundcenters.length < end ? fundcenters.length : end;
                
                //TODO 调用webservice接口获取数据,把数据放在LinkedList里面，根据分页的数量显示对应的内容
                
                for(int i = begin ; i < endtotal; i++){
                    JSONObject jo = new JSONObject();
                    //基金中心编码
                    String jjzxdm_value = fundcenters[i].getFICTR();
                    //基金中心名称
                    String jjzxmc_value = fundcenters[i].getBEZEICH();
                    //基金中心说明
                    String jjzxsm_value = fundcenters[i].getBESCHR();
                    //有效期始于
                    Calendar yxqsy_value = fundcenters[i].getDATAB();
                    String yxqsy_str = "";
                    if(null == yxqsy_value) {
                        yxqsy_str = "";
                    } else {
                        yxqsy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqsy_value.getTime());
                    }
                    //有效期终于
                    Calendar yxqzy_value = fundcenters[i].getDATBIS();
                    String yxqzy_str = "";
                    if(null == yxqzy_value) {
                        yxqzy_str = "";
                    } else {
                        yxqzy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqzy_value.getTime());
                    }
                    //申请号
                    String sqh_value = fundcenters[i].getApplyNumber();
                    //创建日期
                    String createdate_value = "";
                    Calendar createdate = fundcenters[i].getCreateDate();
                    if(null == createdate) {
                        createdate_value = "";
                    } else {
                        createdate_value = new SimpleDateFormat("yyyy-MM-dd").format(createdate.getTime());
                    }
                    //创建者
                    String creater = fundcenters[i].getApplicant();
                    //更新者
                    String updater = fundcenters[i].getUpdateBy();
                    //负责人名称
                    String fzrmc = "";
                    //更新日期
                    String gxrq = "";
                    Calendar updatedate = fundcenters[i].getUpdateDate();
                    if(null != updatedate) {
                        gxrq = new SimpleDateFormat("yyyy-MM-dd").format(updatedate.getTime());
                    }
                    //公司代码
                    String gsdm = "";
                    CompanyCodeLookup companylookup = fundcenters[i].getBUKRS();
                    if(null != companylookup) {
                        gsdm = companylookup.getDisplayValue();
                    }
                    String cwglfw_value = fundcenters[i].getFIKRS();
                    //审批状态
                    ApprovalStatusLookup spzt = fundcenters[i].getAPCOD();
                    String spzt_value = "";
                    if(null != spzt) {
                        spzt_value = spzt.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbz = fundcenters[i].getLVOMA();
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = fundcenters[i].getServiceRelationshipsTuple();
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
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+jjzxdm_value+"')\">"+jjzxdm_value+"</a>";
                    if(!"".equals(flag)){
                        jo.put("jjzxdm", jjzxdm_val);
                    } else {
                        jo.put("jjzxdm", jjzxdm_value);
                    }
                    jo.put("jjzxmc", jjzxmc_value);
                    jo.put("jjzxsm", jjzxsm_value);
                    jo.put("yxqsy", yxqsy_str);
                    jo.put("yxqzy", yxqzy_str);
                    jo.put("sqh", sqh_value);
                    jo.put("createdate", createdate_value);
                    jo.put("creater", creater);
                    jo.put("updater", updater);
                    jo.put("fzrmc", fzrmc);
                    jo.put("gxrq", gxrq);
                    jo.put("gsdm", gsdm);
                    jo.put("spzt", spzt_value);
                    jo.put("djbz", djbz);
                    jo.put("cwglfw_value", cwglfw_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", fundcenters.length);
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
     * 根据基金中心编号查询数据-供基本信息和服务关系用
     * 
     * @param jjzxdm
     * @return
     */
    public Map<String,Object> getdata(String jjzxdm) {
        Map<String,Object> map = new HashMap<String,Object>();
        try {
            JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
            FundcenterQuery fundcenterQuery = new FundcenterQuery();
            FundcenterCriteria fundcenterCriteria = new FundcenterCriteria();
            //基金中心代码 查询条件
            if(!"".equals(jjzxdm)){
                fundcenterCriteria.setFICTR(publicmethod.setTextCriteria(jjzxdm));
            }
            fundcenterQuery.setCriteria(fundcenterCriteria);
            FundcenterResultSet fundcenterResultSet;
            try {
                fundcenterResultSet = f.searchFundcenter(fundcenterQuery, publicmethod.setReposInfo());
                Fundcenter[] fundcenters = fundcenterResultSet.getFundcenter();
                if(null == fundcenters) {
                    return new HashMap<String,Object>();
                }
                for(int i = 0 ; i < 1; i++){
                    //基金中心编码
                    String jjzxdm_value = fundcenters[i].getFICTR();
                    //基金中心名称
                    String jjzxmc_value = fundcenters[i].getBEZEICH();
                    //基金中心说明
                    String jjzxsm_value = fundcenters[i].getBESCHR();
                    //有效期始于
                    Calendar yxqsy_value = fundcenters[i].getDATAB();
                    String yxqsy_str = "";
                    if(null == yxqsy_value) {
                        yxqsy_str = "";
                    } else {
                        yxqsy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqsy_value.getTime());
                    }
                    //有效期终于
                    Calendar yxqzy_value = fundcenters[i].getDATBIS();
                    String yxqzy_str = "";
                    if(null == yxqzy_value) {
                        yxqzy_str = "";
                    } else {
                        yxqzy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqzy_value.getTime());
                    }
                    //申请号
                    String sqh_value = fundcenters[i].getApplyNumber();
                    //创建日期
                    String createdate_value = "";
                    Calendar createdate = fundcenters[i].getCreateDate();
                    if(null == createdate) {
                        createdate_value = "";
                    } else {
                        createdate_value = new SimpleDateFormat("yyyy-MM-dd").format(createdate.getTime());
                    }
                    //创建者
                    String creater = fundcenters[i].getApplicant();
                    //更新者
                    String updater = fundcenters[i].getUpdateBy();
                    //负责人名称
                    String fzrmc = "";
                    //更新日期
                    String gxrq = "";
                    Calendar updatedate = fundcenters[i].getUpdateDate();
                    if(null != updatedate) {
                        gxrq = new SimpleDateFormat("yyyy-MM-dd").format(updatedate.getTime());
                    }
                    //公司代码
                    String gsdm = "";
                    CompanyCodeLookup companylookup = fundcenters[i].getBUKRS();
                    if(null != companylookup) {
                        gsdm = companylookup.getDisplayValue();
                    }
                    String cwglfw_value = fundcenters[i].getFIKRS();
                    //审批状态
                    ApprovalStatusLookup spzt = fundcenters[i].getAPCOD();
                    String spzt_value = "";
                    if(null != spzt) {
                        spzt_value = spzt.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbz = fundcenters[i].getLVOMA();
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = fundcenters[i].getServiceRelationshipsTuple();
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
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+jjzxdm_value+"')\">"+jjzxdm_value+"</a>";
                    if(!"".equals("")){
                        map.put("jjzxdm", jjzxdm_val);
                    } else {
                        map.put("jjzxdm", jjzxdm_value);
                    }
                    map.put("jjzxmc", jjzxmc_value);
                    map.put("jjzxsm", jjzxsm_value);
                    map.put("yxqsy", yxqsy_str);
                    map.put("yxqzy", yxqzy_str);
                    map.put("sqh", sqh_value);
                    map.put("createdate", createdate_value);
                    map.put("creater", creater);
                    map.put("updater", updater);
                    map.put("fzrmc", fzrmc);
                    map.put("gxrq", gxrq);
                    map.put("gsdm", gsdm);
                    map.put("spzt", spzt_value);
                    map.put("djbz", djbz);
                    map.put("cwglfw_value", cwglfw_value);
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
        
        
        JJZXPublicMethod publicmethod = new JJZXPublicMethod();
        try {
            JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
            JSONArray jsonArray = new JSONArray();
            FundcenterQuery fundcenterQuery = new FundcenterQuery();
            FundcenterCriteria fundcenterCriteria = new FundcenterCriteria();
            if(!"".equals("")){
                ClientQuery ClientQuery = new ClientQuery();
                ClientCriteria ClientCriteria = new ClientCriteria();
                ClientCriteria.setCode(publicmethod.setTextCriteria(""));
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
                        fundcenterCriteria.setServiceRelationshipsTupleCLIENT_SYSTEM(PicklistCriteria);
                    } else {
                        JSONObject jsonresult = new JSONObject();
                        jsonresult.put("totalcount", "0");
                        jsonresult.put("result", jsonArray);
                        return;
                    }
                } else {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    return;
                }
            }
            if(!"".equals("")){
                CompanyCodeQuery CompanyCodeQuery = new CompanyCodeQuery();
                CompanyCodeCriteria CompanyCodeCriteria = new CompanyCodeCriteria();
                CompanyCodeCriteria.setCode(publicmethod.setTextCriteria("1111111111"));
                CompanyCodeQuery.setCriteria(CompanyCodeCriteria);
                CompanyCodeResultSet CompanyCodeResultSet = f.searchCompanyCode(CompanyCodeQuery, publicmethod.setReposInfo());
                if(null == CompanyCodeResultSet) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    return;
                } else {
                    CompanyCode[] CompanyCodes = CompanyCodeResultSet.getCompanyCode();
                    if(CompanyCodes.length == 0 || null == CompanyCodes) {
                        JSONObject jsonresult = new JSONObject();
                        jsonresult.put("totalcount", "0");
                        jsonresult.put("result", jsonArray);
                        return;
                    } else{
                        PicklistCriteria PicklistCriteria = new PicklistCriteria();
                        PicklistConstraint[] PicklistConstraints = new PicklistConstraint[1];
                        PicklistConstraint PicklistConstraint = new PicklistConstraint();
                        PicklistConstraint.setExpressionOperator("EQUALS");
                        RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
                        RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
                        RecordIdentifierConstraint.setInternalID(CompanyCodes[0].getRecordIdentification().getInternalID());
                        RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
                        PicklistConstraint.setValue(RecordIdentifierConstraints);
                        PicklistConstraints[0] = PicklistConstraint;
                        PicklistCriteria.setConstraint(PicklistConstraints);
                        fundcenterCriteria.setBUKRS(PicklistCriteria);
                    }
                }
            }
            fundcenterQuery.setCriteria(fundcenterCriteria);
            FundcenterResultSet fundcenterResultSet;
            try {
                fundcenterResultSet = f.searchFundcenter(fundcenterQuery, publicmethod.setReposInfo());
                Fundcenter[] fundcenters = fundcenterResultSet.getFundcenter();
                if(null == fundcenters) {
                    JSONObject jsonresult = new JSONObject();
                    jsonresult.put("totalcount", "0");
                    jsonresult.put("result", jsonArray);
                    return;
                }
                
                //TODO 调用webservice接口获取数据,把数据放在LinkedList里面，根据分页的数量显示对应的内容
                
                for(int i = 0 ; i < fundcenters.length; i++){
                    JSONObject jo = new JSONObject();
                    //基金中心编码
                    String jjzxdm_value = fundcenters[i].getFICTR();
                    //基金中心名称
                    String jjzxmc_value = fundcenters[i].getBEZEICH();
                    //基金中心说明
                    String jjzxsm_value = fundcenters[i].getBESCHR();
                    //有效期始于
                    Calendar yxqsy_value = fundcenters[i].getDATAB();
                    String yxqsy_str = "";
                    if(null == yxqsy_value) {
                        yxqsy_str = "";
                    } else {
                        yxqsy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqsy_value.getTime());
                    }
                    //有效期终于
                    Calendar yxqzy_value = fundcenters[i].getDATBIS();
                    String yxqzy_str = "";
                    if(null == yxqzy_value) {
                        yxqzy_str = "";
                    } else {
                        yxqzy_str = new SimpleDateFormat("yyyy-MM-dd").format(yxqzy_value.getTime());
                    }
                    //申请号
                    String sqh_value = fundcenters[i].getApplyNumber();
                    //创建日期
                    String createdate_value = "";
                    Calendar createdate = fundcenters[i].getCreateDate();
                    if(null == createdate) {
                        createdate_value = "";
                    } else {
                        createdate_value = new SimpleDateFormat("yyyy-MM-dd").format(createdate.getTime());
                    }
                    //创建者
                    String creater = fundcenters[i].getApplicant();
                    //更新者
                    String updater = fundcenters[i].getUpdateBy();
                    //负责人名称
                    String fzrmc = "";
                    //更新日期
                    String gxrq = "";
                    Calendar updatedate = fundcenters[i].getUpdateDate();
                    if(null != updatedate) {
                        gxrq = new SimpleDateFormat("yyyy-MM-dd").format(updatedate.getTime());
                    }
                    //公司代码
                    String gsdm = "";
                    CompanyCodeLookup companylookup = fundcenters[i].getBUKRS();
                    if(null != companylookup) {
                        gsdm = companylookup.getDisplayValue();
                    }
                    String cwglfw_value = fundcenters[i].getFIKRS();
                    //审批状态
                    ApprovalStatusLookup spzt = fundcenters[i].getAPCOD();
                    String spzt_value = "";
                    if(null != spzt) {
                        spzt_value = spzt.getDisplayValue();
                    }
                    //冻结标识
                    boolean djbz = fundcenters[i].getLVOMA();
                    ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple = fundcenters[i].getServiceRelationshipsTuple();
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
                    
                    
                    String jjzxdm_val = "<a href=\"javascript:openwlbh('"+jjzxdm_value+"')\">"+jjzxdm_value+"</a>";
                    if(!"".equals("")){
                        jo.put("jjzxdm", jjzxdm_val);
                    } else {
                        jo.put("jjzxdm", jjzxdm_value);
                    }
                    jo.put("jjzxmc", jjzxmc_value);
                    jo.put("jjzxsm", jjzxsm_value);
                    jo.put("yxqsy", yxqsy_str);
                    jo.put("yxqzy", yxqzy_str);
                    jo.put("sqh", sqh_value);
                    jo.put("createdate", createdate_value);
                    jo.put("creater", creater);
                    jo.put("updater", updater);
                    jo.put("fzrmc", fzrmc);
                    jo.put("gxrq", gxrq);
                    jo.put("gsdm", gsdm);
                    jo.put("spzt", spzt_value);
                    jo.put("djbz", djbz);
                    jo.put("cwglfw_value", cwglfw_value);
                    jsonArray.add(jo);
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("totalcount", fundcenters.length);
                jsonresult.put("result", jsonArray);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }
    }
}
