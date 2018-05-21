package weaver.interfaces.gx.jyl.kjkm;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

import com.alibaba.fastjson.JSONObject;

/**
 * 会计科目分发
 */
public class KJKMFFServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private PublicMethod PublicMethods = new PublicMethod();
    private KJKMPublicMethod publicmethod = new KJKMPublicMethod();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String kjkmdms = Util.null2String(request.getParameter("kjkmdms"));
        String userid = Util.null2String(request.getParameter("userid"));
        RecordSet rs = new RecordSet();
        rs.execute("select textfield1 from hrmresource where id = '"+userid+"'");
        rs.next();
        String gsdm = Util.null2o(rs.getString("textfield1"));
        if("".equals(gsdm)){
            JSONObject jsonresult = new JSONObject();
            jsonresult.put("flag", "0");
            jsonresult.put("message", "您对应的公司代码为空.");
            response.setContentType("application/json; charset=utf-8");
            try {
                response.getWriter().print(jsonresult.toString());
                return;
            } catch (IOException e) {
                e.printStackTrace();
                bean.writeLog(e.getLocalizedMessage());
            }
        } 
        List<FFXTMode> list = PublicMethods.getFFXT(gsdm, "科目");
        if("".equals(kjkmdms)){
            JSONObject jsonresult = new JSONObject();
            jsonresult.put("flag", "0");
            jsonresult.put("message", "传入参数非法");
            response.setContentType("application/json; charset=utf-8");
            try {
                response.getWriter().print(jsonresult.toString());
                return;
            } catch (IOException e) {
                e.printStackTrace();
                bean.writeLog(e.getLocalizedMessage());
            }
        }
        String[] dms = kjkmdms.split(",");
        JSGX_MDM_FICOTRViProxy proxy = new JSGX_MDM_FICOTRViProxy();
        AccountsUpdate[] accountsUpdates = new AccountsUpdate[dms.length];
        for(int i = 0; i < dms.length; i++){
            AccountsUpdate accountsUpdate = new AccountsUpdate();
            AccountsQuery query = new AccountsQuery();
            AccountsCriteria accountsCriteria = new AccountsCriteria();
            accountsCriteria.setSAKNR(publicmethod.setTextCriteria(dms[i]));
            query.setCriteria(accountsCriteria);
            AccountsResultSet fres = null;
            try {
                fres = proxy.searchAccounts(query, publicmethod.setReposInfo());
            } catch (RemoteException e1) {
                e1.printStackTrace();
            }
            AccountsID fid = new AccountsID();
            fid.setInternalID(fres.getAccounts()[0].getRecordIdentification().getInternalID());
            accountsUpdate.setRecordIdentification(fid);
            accountsUpdate.setSAKNR(dms[i]);
            String applicant_chinese_value = "";
            try {
                applicant_chinese_value = new ResourceComInfo().getLastname(userid);
            } catch (Exception e2) {
                e2.printStackTrace();
                new weaver.general.BaseBean().writeLog("查询申请人："+userid+"失败。不存在该人员编号。");
            }
            accountsUpdate.setUpdateBy(applicant_chinese_value);
            OperationLookup operationLookup = publicmethod.getOperation("4", proxy);
            accountsUpdate.setOperation(operationLookup);
            ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
            for(int j = 0; j < list.size(); j++){
                String xtdm = list.get(j).getFfxtdm();
                ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(xtdm, proxy);
                DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0", proxy);
                serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
                serviceRelationshipsTupleTuples[j] = serviceRelationshipsTupleTuple;
            }
            accountsUpdate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
            accountsUpdates[i] = accountsUpdate;
        }
        UpdateConfigurationParameters updateConfigurationParameters = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = proxy.updateAccounts(accountsUpdates, publicmethod.setReposInfo(), updateConfigurationParameters);
            if(null != executionStatus && executionStatus.length > 0) {
                for(int m = 0; m < executionStatus.length; m++) {
                    if(null != executionStatus[m].getFault()) {
                        JSONObject jsonresult = new JSONObject();
                        jsonresult.put("flag", "0");
                        jsonresult.put("message", executionStatus[m].getFault()[0].getText());
                        response.setContentType("application/json; charset=utf-8");
                        try {
                            response.getWriter().print(jsonresult.toString());
                            return;
                        } catch (IOException e) {
                            e.printStackTrace();
                            bean.writeLog(e.getLocalizedMessage());
                        }
                    }
                }
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("flag", "1");
                jsonresult.put("message", "分发成功");
                response.setContentType("application/json; charset=utf-8");
                try {
                    response.getWriter().print(jsonresult.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                    bean.writeLog(e.getLocalizedMessage());
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        KJKMPublicMethod publicmethod = new KJKMPublicMethod();
        AccountsQuery query = new AccountsQuery();
        AccountsCriteria accountsCriteria = new AccountsCriteria();
        accountsCriteria.setSAKNR(publicmethod.setTextCriteria("1000003111"));
        query.setCriteria(accountsCriteria);
        AccountsResultSet fres = null;
        try {
            fres = f.searchAccounts(query, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        
        
        AccountsUpdate[] updates = new AccountsUpdate[1];
        AccountsUpdate update = new AccountsUpdate();
        update.setSAKNR("1000003111");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[2];
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM("ECC_NY",f);
        DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0",f);
        distributionStatusLookup.setDisplayValue("0");
        serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
        
        ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple2 = publicmethod.getFFXTDM("NANBEI",f);
        DistributionStatusLookup distributionStatusLookup2 = publicmethod.getFFZT("0",f);
        distributionStatusLookup2.setDisplayValue("0");
        serviceRelationshipsTupleTuple2.setDISTUS(distributionStatusLookup);

        serviceRelationshipsTupleTuples[0] = serviceRelationshipsTupleTuple;
        serviceRelationshipsTupleTuples[1] = serviceRelationshipsTupleTuple2;
        
        update.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        update.setUpdateBy("1");
        OperationLookup oper = publicmethod.getOperation("14", f);
        update.setOperation(oper);
        AccountsID fid = new AccountsID();
        fid.setInternalID(fres.getAccounts()[0].getRecordIdentification().getInternalID());
        update.setRecordIdentification(fid);
        updates[0] = update;
        UpdateConfigurationParameters updateConfigurationParameters  = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = f.updateAccounts(updates, publicmethod.setReposInfo(), updateConfigurationParameters);
            System.out.println(executionStatus[0].getDescription());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
