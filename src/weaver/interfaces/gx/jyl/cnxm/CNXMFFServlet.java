package weaver.interfaces.gx.jyl.cnxm;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate;
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
 * 承诺项目分发
 */
public class CNXMFFServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private BaseBean bean = new BaseBean();
    private PublicMethod PublicMethods = new PublicMethod();
    private CNXMPublicMethod publicmethod = new CNXMPublicMethod();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String cnxmbm = Util.null2String(request.getParameter("cnxmbm"));
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
        List<FFXTMode> list = PublicMethods.getFFXT(gsdm, "承诺项目");
        if("".equals(cnxmbm)){
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
        String[] dms = cnxmbm.split(",");
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        CommitmentltemUpdate[] updates = new CommitmentltemUpdate[dms.length];
        for(int m = 0; m < dms.length; m++) {
            CommitmentltemUpdate update = new CommitmentltemUpdate();
            CommitmentltemQuery query = new CommitmentltemQuery();
            CommitmentltemCriteria fundcenterCriteria = new CommitmentltemCriteria();
            fundcenterCriteria.setFIPOS(publicmethod.setTextCriteria(dms[m]));
            query.setCriteria(fundcenterCriteria);
            CommitmentltemResultSet fres = null;
            try {
                fres = f.searchCommitmentltem(query, publicmethod.setReposInfo());
            } catch (RemoteException e1) {
                e1.printStackTrace();
            }
            if(null == fres || fres.getCommitmentltem().length <= 0){
                JSONObject jsonresult = new JSONObject();
                jsonresult.put("flag", "0");
                jsonresult.put("message", "分发失败");
                response.setContentType("application/json; charset=utf-8");
                try {
                    response.getWriter().print(jsonresult.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                    bean.writeLog(e.getLocalizedMessage());
                }
            }
            CommitmentltemID CommitmentltemID = new CommitmentltemID();
            CommitmentltemID.setInternalID(fres.getCommitmentltem()[0].getRecordIdentification().getInternalID());
            update.setRecordIdentification(CommitmentltemID);
            
            update.setFIPOS(dms[m]);
            String applicant_chinese_value = "";
            try {
                applicant_chinese_value = new ResourceComInfo().getLastname(userid);
            } catch (Exception e2) {
                e2.printStackTrace();
                new weaver.general.BaseBean().writeLog("查询申请人："+userid+"失败。不存在该人员编号。");
            }
            update.setUpdateBy(applicant_chinese_value);
            OperationLookup operatelook = publicmethod.getOperation("14", f);
            operatelook.setDisplayValue("14");
            update.setOperation(operatelook);//操作标识
            
            ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
            for(int i = 0; i < list.size(); i++) {
                String ffxtdm = list.get(i).getFfxtdm();
                ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm,f);
                serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
                DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0",f);
                distributionStatusLookup.setDisplayValue("0");
                serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
                serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
            }
            update.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
            updates[m] = update;
        }
        UpdateConfigurationParameters updateConfigurationParameters  = new UpdateConfigurationParameters();
        try {
            ExecutionStatus[] executionStatus = f.updateCommitmentltem(updates, publicmethod.setReposInfo(), updateConfigurationParameters);
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
    }
}
