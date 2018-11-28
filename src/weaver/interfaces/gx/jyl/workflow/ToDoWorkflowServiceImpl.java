package weaver.interfaces.gx.jyl.workflow;

import com.alibaba.fastjson.JSON;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.workflow.webservices.WorkflowServiceImpl;
import weaver.workflow.workflow.WorkflowComInfo;

import java.util.ArrayList;
import java.util.List;

public class ToDoWorkflowServiceImpl extends BaseBean implements ToDoWorkflowService {

    @Override
    public String toDoWorkflow(String loginid, String token) {

        writeLog("接收loginid:" + loginid);
        writeLog("接收token:" + token);

        String url = getPropValue("xh_workflow", "oa_url");
        String tokenString = getPropValue("xh_workflow", "token");
        String md5String = Util.getEncrypt(tokenString + loginid);

        ToDoWorkflowInfo toDoWorkflowInfo = new ToDoWorkflowInfo();
        List<ToDoWorkflowInfo.DataBean> list = new ArrayList<ToDoWorkflowInfo.DataBean>();

        if (!md5String.equals(token)) {
            toDoWorkflowInfo.setMessage("传入参数token[" + token + "]与对应[" + loginid + "]加密不一致");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }
        // 判断loginid在OA中是否存在
        RecordSet recordSet = new RecordSet();
        String checkLoginidIsExistSQL = "select id from hrmresource where loginid = '" + loginid + "'";
        recordSet.execute(checkLoginidIsExistSQL);
        recordSet.next();
        String userid = Util.null2String(recordSet.getString("id"));
        if (userid.equals("")) {
            toDoWorkflowInfo.setMessage("传入参数loginid[" + loginid + "]在OA中不存在");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }

        WorkflowComInfo workflowComInfo = null;
        try {
            workflowComInfo = new WorkflowComInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String toDoWorkflowDataSQL = "select distinct t1.requestname,t1.currentnodeid,t1.requestid,t1.workflowid,t2.receivedate,t2.receivetime,t2.viewtype " +
                "  from workflow_requestbase t1,workflow_currentoperator t2 where t1.requestid=t2.requestid " +
                "and t2.usertype = 0 and t2.userid = '" + userid + "' and t2.isremark in( '0','1','5','7') and t2.islasttimes=1";
        writeLog("获取待办SQL:" + toDoWorkflowDataSQL);
        recordSet.execute(toDoWorkflowDataSQL);

        while (recordSet.next()) {
            ToDoWorkflowInfo.DataBean dataBean = new ToDoWorkflowInfo.DataBean();
            String viewtype = Util.null2String(recordSet.getString("viewtype"));
            String requestid = Util.null2String(recordSet.getString("requestid"));
            String workflowid = Util.null2String(recordSet.getString("workflowid"));
            String requestname = Util.null2String(recordSet.getString("requestname"));
            String receivedate = Util.null2String(recordSet.getString("receivedate"));
            String receivetime = Util.null2String(recordSet.getString("receivetime"));
            String currentnodeid = Util.null2String(recordSet.getString("currentnodeid"));
            String receivedatetime = receivedate + " " + receivetime;

            String undouser = getUndoUser(requestid);

            String currentNodeName = getCurrentName(currentnodeid);

            String workflowname = workflowComInfo.getWorkflowname(workflowid);


            dataBean.setUrl(url + "/interface/jiangyl/xh/operation.jsp?requestid=" + requestid + "&xh_ac=" + loginid + "&xh_token=" + token);
            dataBean.setRequestname(requestname);
            dataBean.setCurrentnode(currentNodeName);
            dataBean.setCurrentoperator(undouser);
            dataBean.setReceivedate(receivedatetime);
            dataBean.setType(workflowname);
            dataBean.setViewtype(viewtype);

            list.add(dataBean);
        }
        toDoWorkflowInfo.setMessage("success");
        toDoWorkflowInfo.setData(list);
        return JSON.toJSONString(toDoWorkflowInfo);
    }

    @Override
    public String toDoWorkflowCount(String loginid, String token) {
        writeLog("接收loginid:" + loginid);
        writeLog("接收token:" + token);

        String url = getPropValue("xh_workflow", "oa_url");
        String tokenString = getPropValue("xh_workflow", "token");
        String md5String = Util.getEncrypt(tokenString + loginid);

        ToDoWorkflowCount toDoWorkflowCount = new ToDoWorkflowCount();
        if (!md5String.equals(token)) {
            toDoWorkflowCount.setMessage("传入参数token[" + token + "]与对应[" + loginid + "]加密不一致");
            toDoWorkflowCount.setTotal(0);
            toDoWorkflowCount.setUnread(0);
            toDoWorkflowCount.setSuccess(false);
            return JSON.toJSONString(toDoWorkflowCount);
        }
        // 判断loginid在OA中是否存在
        RecordSet recordSet = new RecordSet();
        String checkLoginidIsExistSQL = "select id from hrmresource where loginid = '" + loginid + "'";
        recordSet.execute(checkLoginidIsExistSQL);
        recordSet.next();
        String userid = Util.null2String(recordSet.getString("id"));
        if (userid.equals("")) {
            toDoWorkflowCount.setMessage("传入参数loginid[" + loginid + "]在OA中不存在");
            toDoWorkflowCount.setTotal(0);
            toDoWorkflowCount.setUnread(0);
            toDoWorkflowCount.setSuccess(false);
            return JSON.toJSONString(toDoWorkflowCount);
        }

        String toDoWorkflowDataSQL = "select count(distinct t1.requestid) count" +
                "  from workflow_requestbase t1,workflow_currentoperator t2 where t1.requestid=t2.requestid " +
                "and t2.usertype = 0 and t2.userid = '" + userid + "' and t2.isremark in( '0','1','5','7') and t2.islasttimes=1 ";
        writeLog("获取待办总数SQL:" + toDoWorkflowDataSQL);
        recordSet.execute(toDoWorkflowDataSQL);
        recordSet.next();
        String count = Util.null2o(recordSet.getString("count"));

        String unReadSQL = "select count(distinct t1.requestid) count" +
                "  from workflow_requestbase t1,workflow_currentoperator t2 where t1.requestid=t2.requestid " +
                "and t2.usertype = 0 and t2.userid = '" + userid + "' and t2.isremark in( '0','1','5','7') and t2.islasttimes=1 and t2.viewtype = '0' ";

        recordSet.execute(unReadSQL);
        recordSet.next();
        String unread = Util.null2o(recordSet.getString("count"));

        toDoWorkflowCount.setMessage("success");
        toDoWorkflowCount.setTotal(Integer.parseInt(count));
        toDoWorkflowCount.setUnread(Integer.parseInt(unread));
        toDoWorkflowCount.setSuccess(true);
        return JSON.toJSONString(toDoWorkflowCount);
    }

    @Override
    public String ybWorkflow(String loginid, String token) {
        writeLog("接收loginid:" + loginid);
        writeLog("接收token:" + token);

        String url = getPropValue("xh_workflow", "oa_url");
        String tokenString = getPropValue("xh_workflow", "token");
        String md5String = Util.getEncrypt(tokenString + loginid);

        ToDoWorkflowInfo toDoWorkflowInfo = new ToDoWorkflowInfo();
        List<ToDoWorkflowInfo.DataBean> list = new ArrayList<ToDoWorkflowInfo.DataBean>();

        if (!md5String.equals(token)) {
            toDoWorkflowInfo.setMessage("传入参数token[" + token + "]与对应[" + loginid + "]加密不一致");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }
        // 判断loginid在OA中是否存在
        RecordSet recordSet = new RecordSet();
        String checkLoginidIsExistSQL = "select id from hrmresource where loginid = '" + loginid + "'";
        recordSet.execute(checkLoginidIsExistSQL);
        recordSet.next();
        String userid = Util.null2String(recordSet.getString("id"));
        if (userid.equals("")) {
            toDoWorkflowInfo.setMessage("传入参数loginid[" + loginid + "]在OA中不存在");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }

        WorkflowComInfo workflowComInfo = null;
        try {
            workflowComInfo = new WorkflowComInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String toDoWorkflowDataSQL = "select distinct t1.requestname,t1.currentnodeid,t1.requestid,t1.workflowid,t2.receivedate,t2.receivetime,t2.viewtype " +
                "  from workflow_requestbase t1,workflow_currentoperator t2 where t1.requestid=t2.requestid " +
                "and t2.usertype = 0 and t2.userid = '" + userid + "' and t2.isremark ='2' and t2.iscomplete=0 and t2.islasttimes=1 ";
        writeLog("获取已办SQL:" + toDoWorkflowDataSQL);
        recordSet.execute(toDoWorkflowDataSQL);

        while (recordSet.next()) {
            ToDoWorkflowInfo.DataBean dataBean = new ToDoWorkflowInfo.DataBean();
            String viewtype = Util.null2String(recordSet.getString("viewtype"));
            String requestid = Util.null2String(recordSet.getString("requestid"));
            String workflowid = Util.null2String(recordSet.getString("workflowid"));
            String requestname = Util.null2String(recordSet.getString("requestname"));
            String receivedate = Util.null2String(recordSet.getString("receivedate"));
            String receivetime = Util.null2String(recordSet.getString("receivetime"));
            String currentnodeid = Util.null2String(recordSet.getString("currentnodeid"));
            String receivedatetime = receivedate + " " + receivetime;

            String undouser = getUndoUser(requestid);

            String currentNodeName = getCurrentName(currentnodeid);

            String workflowname = workflowComInfo.getWorkflowname(workflowid);


            dataBean.setUrl(url + "/interface/jiangyl/xh/operation.jsp?requestid=" + requestid + "&xh_ac=" + loginid + "&xh_token=" + token);
            dataBean.setRequestname(requestname);
            dataBean.setCurrentnode(currentNodeName);
            dataBean.setCurrentoperator(undouser);
            dataBean.setReceivedate(receivedatetime);
            dataBean.setType(workflowname);
            dataBean.setViewtype(viewtype);

            list.add(dataBean);
        }
        toDoWorkflowInfo.setMessage("success");
        toDoWorkflowInfo.setData(list);
        return JSON.toJSONString(toDoWorkflowInfo);
    }

    @Override
    public String bjWorkflow(String loginid, String token) {
        writeLog("接收loginid:" + loginid);
        writeLog("接收token:" + token);

        String url = getPropValue("xh_workflow", "oa_url");
        String tokenString = getPropValue("xh_workflow", "token");
        String md5String = Util.getEncrypt(tokenString + loginid);

        ToDoWorkflowInfo toDoWorkflowInfo = new ToDoWorkflowInfo();
        List<ToDoWorkflowInfo.DataBean> list = new ArrayList<ToDoWorkflowInfo.DataBean>();

        if (!md5String.equals(token)) {
            toDoWorkflowInfo.setMessage("传入参数token[" + token + "]与对应[" + loginid + "]加密不一致");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }
        // 判断loginid在OA中是否存在
        RecordSet recordSet = new RecordSet();
        String checkLoginidIsExistSQL = "select id from hrmresource where loginid = '" + loginid + "'";
        recordSet.execute(checkLoginidIsExistSQL);
        recordSet.next();
        String userid = Util.null2String(recordSet.getString("id"));
        if (userid.equals("")) {
            toDoWorkflowInfo.setMessage("传入参数loginid[" + loginid + "]在OA中不存在");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }

        WorkflowComInfo workflowComInfo = null;
        try {
            workflowComInfo = new WorkflowComInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String toDoWorkflowDataSQL = "select distinct t1.requestname,t1.currentnodeid,t1.requestid,t1.workflowid,t2.receivedate,t2.receivetime,t2.viewtype " +
                "  from workflow_requestbase t1,workflow_currentoperator t2 where t1.requestid=t2.requestid " +
                "and t2.usertype = 0 and t2.userid = '" + userid + "' and t2.isremark in('2','4') and t1.currentnodetype = '3' and iscomplete=1 and islasttimes=1 ";
        writeLog("获取办结SQL:" + toDoWorkflowDataSQL);
        recordSet.execute(toDoWorkflowDataSQL);

        while (recordSet.next()) {
            ToDoWorkflowInfo.DataBean dataBean = new ToDoWorkflowInfo.DataBean();
            String viewtype = Util.null2String(recordSet.getString("viewtype"));
            String requestid = Util.null2String(recordSet.getString("requestid"));
            String workflowid = Util.null2String(recordSet.getString("workflowid"));
            String requestname = Util.null2String(recordSet.getString("requestname"));
            String receivedate = Util.null2String(recordSet.getString("receivedate"));
            String receivetime = Util.null2String(recordSet.getString("receivetime"));
            String currentnodeid = Util.null2String(recordSet.getString("currentnodeid"));
            String receivedatetime = receivedate + " " + receivetime;

            String undouser = getUndoUser(requestid);

            String currentNodeName = getCurrentName(currentnodeid);

            String workflowname = workflowComInfo.getWorkflowname(workflowid);


            dataBean.setUrl(url + "/interface/jiangyl/xh/operation.jsp?requestid=" + requestid + "&xh_ac=" + loginid + "&xh_token=" + token);
            dataBean.setRequestname(requestname);
            dataBean.setCurrentnode(currentNodeName);
            dataBean.setCurrentoperator(undouser);
            dataBean.setReceivedate(receivedatetime);
            dataBean.setType(workflowname);
            dataBean.setViewtype(viewtype);

            list.add(dataBean);
        }
        toDoWorkflowInfo.setMessage("success");
        toDoWorkflowInfo.setData(list);
        return JSON.toJSONString(toDoWorkflowInfo);
    }

    @Override
    public String csWorkflow(String loginid, String token) {
        writeLog("接收loginid:" + loginid);
        writeLog("接收token:" + token);

        String url = getPropValue("xh_workflow", "oa_url");
        String tokenString = getPropValue("xh_workflow", "token");
        String md5String = Util.getEncrypt(tokenString + loginid);

        ToDoWorkflowInfo toDoWorkflowInfo = new ToDoWorkflowInfo();
        List<ToDoWorkflowInfo.DataBean> list = new ArrayList<ToDoWorkflowInfo.DataBean>();

        if (!md5String.equals(token)) {
            toDoWorkflowInfo.setMessage("传入参数token[" + token + "]与对应[" + loginid + "]加密不一致");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }
        // 判断loginid在OA中是否存在
        RecordSet recordSet = new RecordSet();
        String checkLoginidIsExistSQL = "select id from hrmresource where loginid = '" + loginid + "'";
        recordSet.execute(checkLoginidIsExistSQL);
        recordSet.next();
        String userid = Util.null2String(recordSet.getString("id"));
        if (userid.equals("")) {
            toDoWorkflowInfo.setMessage("传入参数loginid[" + loginid + "]在OA中不存在");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }

        WorkflowComInfo workflowComInfo = null;
        try {
            workflowComInfo = new WorkflowComInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String toDoWorkflowDataSQL = "select distinct t1.requestname,t1.currentnodeid,t1.requestid,t1.workflowid,t2.receivedate,t2.receivetime,t2.viewtype " +
                "  from workflow_requestbase t1,workflow_currentoperator t2 where t1.requestid=t2.requestid " +
                "and t2.usertype = 0 and t2.userid = '" + userid + "' and t2.isremark in( '8','9' ) and t2.islasttimes=1 ";
        writeLog("获取办结SQL:" + toDoWorkflowDataSQL);
        recordSet.execute(toDoWorkflowDataSQL);

        while (recordSet.next()) {
            ToDoWorkflowInfo.DataBean dataBean = new ToDoWorkflowInfo.DataBean();
            String viewtype = Util.null2String(recordSet.getString("viewtype"));
            String requestid = Util.null2String(recordSet.getString("requestid"));
            String workflowid = Util.null2String(recordSet.getString("workflowid"));
            String requestname = Util.null2String(recordSet.getString("requestname"));
            String receivedate = Util.null2String(recordSet.getString("receivedate"));
            String receivetime = Util.null2String(recordSet.getString("receivetime"));
            String currentnodeid = Util.null2String(recordSet.getString("currentnodeid"));
            String receivedatetime = receivedate + " " + receivetime;

            String undouser = getUndoUser(requestid);

            String currentNodeName = getCurrentName(currentnodeid);

            String workflowname = workflowComInfo.getWorkflowname(workflowid);


            dataBean.setUrl(url + "/interface/jiangyl/xh/operation.jsp?requestid=" + requestid + "&xh_ac=" + loginid + "&xh_token=" + token);
            dataBean.setRequestname(requestname);
            dataBean.setCurrentnode(currentNodeName);
            dataBean.setCurrentoperator(undouser);
            dataBean.setReceivedate(receivedatetime);
            dataBean.setType(workflowname);
            dataBean.setViewtype(viewtype);

            list.add(dataBean);
        }
        toDoWorkflowInfo.setMessage("success");
        toDoWorkflowInfo.setData(list);
        return JSON.toJSONString(toDoWorkflowInfo);
    }

    @Override
    public String myWorkflow(String loginid, String token) {
        writeLog("接收loginid:" + loginid);
        writeLog("接收token:" + token);

        String url = getPropValue("xh_workflow", "oa_url");
        String tokenString = getPropValue("xh_workflow", "token");
        String md5String = Util.getEncrypt(tokenString + loginid);

        ToDoWorkflowInfo toDoWorkflowInfo = new ToDoWorkflowInfo();
        List<ToDoWorkflowInfo.DataBean> list = new ArrayList<ToDoWorkflowInfo.DataBean>();

        if (!md5String.equals(token)) {
            toDoWorkflowInfo.setMessage("传入参数token[" + token + "]与对应[" + loginid + "]加密不一致");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }
        // 判断loginid在OA中是否存在
        RecordSet recordSet = new RecordSet();
        String checkLoginidIsExistSQL = "select id from hrmresource where loginid = '" + loginid + "'";
        recordSet.execute(checkLoginidIsExistSQL);
        recordSet.next();
        String userid = Util.null2String(recordSet.getString("id"));
        if (userid.equals("")) {
            toDoWorkflowInfo.setMessage("传入参数loginid[" + loginid + "]在OA中不存在");
            toDoWorkflowInfo.setData(list);
            return JSON.toJSONString(toDoWorkflowInfo);
        }

        WorkflowComInfo workflowComInfo = null;
        try {
            workflowComInfo = new WorkflowComInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String toDoWorkflowDataSQL = "select distinct t1.requestname,t1.currentnodeid,t1.requestid,t1.workflowid,t2.receivedate,t2.receivetime,t2.viewtype " +
                "  from workflow_requestbase t1,workflow_currentoperator t2 where t1.requestid=t2.requestid " +
                "and t2.usertype = 0 and t2.userid = '" + userid + "' and t1.creatertype = 0 and (t1.deleted=0 or t1.deleted is null) and t2.islasttimes=1 ";
        writeLog("获取办结SQL:" + toDoWorkflowDataSQL);
        recordSet.execute(toDoWorkflowDataSQL);

        while (recordSet.next()) {
            ToDoWorkflowInfo.DataBean dataBean = new ToDoWorkflowInfo.DataBean();
            String viewtype = Util.null2String(recordSet.getString("viewtype"));
            String requestid = Util.null2String(recordSet.getString("requestid"));
            String workflowid = Util.null2String(recordSet.getString("workflowid"));
            String requestname = Util.null2String(recordSet.getString("requestname"));
            String receivedate = Util.null2String(recordSet.getString("receivedate"));
            String receivetime = Util.null2String(recordSet.getString("receivetime"));
            String currentnodeid = Util.null2String(recordSet.getString("currentnodeid"));
            String receivedatetime = receivedate + " " + receivetime;

            String undouser = getUndoUser(requestid);

            String currentNodeName = getCurrentName(currentnodeid);

            String workflowname = workflowComInfo.getWorkflowname(workflowid);


            dataBean.setUrl(url + "/interface/jiangyl/xh/operation.jsp?requestid=" + requestid + "&xh_ac=" + loginid + "&xh_token=" + token);
            dataBean.setRequestname(requestname);
            dataBean.setCurrentnode(currentNodeName);
            dataBean.setCurrentoperator(undouser);
            dataBean.setReceivedate(receivedatetime);
            dataBean.setType(workflowname);
            dataBean.setViewtype(viewtype);

            list.add(dataBean);
        }
        toDoWorkflowInfo.setMessage("success");
        toDoWorkflowInfo.setData(list);
        return JSON.toJSONString(toDoWorkflowInfo);
    }

    /**
     * 获取未操作者
     *
     * @param userid
     * @return
     */
    private String getUndoUser(String requestid) {
        RecordSet recordSet = new RecordSet();
        recordSet.execute("select wm_concat( DISTINCT userid) undouser from workflow_currentoperator where " +
                "(isremark in ('0','1','5','7','8','9') or (isremark='4' and viewtype=0))  and requestid='" + requestid + "' ");
        recordSet.next();
        String undouser = Util.null2String(recordSet.getString("undouser"));
        try {
            ResourceComInfo resourceComInfo = new ResourceComInfo();
            return resourceComInfo.getLastnames(undouser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public String getCurrentName(String nodeid) {
        RecordSet recordSet = new RecordSet();
        recordSet.execute("select nodename from WORKFLOW_NODEBASE where id = '" + nodeid + "'");
        recordSet.next();
        return Util.null2String(recordSet.getString("nodename"));
    }

}
