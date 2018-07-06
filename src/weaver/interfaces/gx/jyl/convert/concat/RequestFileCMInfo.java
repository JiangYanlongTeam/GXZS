package weaver.interfaces.gx.jyl.convert.concat;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.convert.concat.WorkflowFileCMInfo;

/**
 * 请求合并信息类
 * @author Administrator
 *
 */
public class RequestFileCMInfo extends BaseBean{

    WorkflowFileCMInfo wfcmInfo = null;
    int workflowid = 0;
    int nodeid = 0;
    int requestid = 0;
    int formid = 0;
    String tablename = "";

    boolean ifQflag = false; //签批文件是否存在
    boolean ifSQflag = false; //签章文件是否存在
    boolean ifQZCflag = false; //签批文件强制初始化
    boolean Nodeflag = false;//判断请求是否停留在当前节点

    int qpwjid = 0; //签批文件
    String owjids = ""; //其他附件
    String mainwejid = ""; //主文档
    int jobid = 0;

    int signattid = 0;////签章文档id
    int qsignattid = 0; //签章后附件id

    int type = Util.getIntValue(Util.null2String(getPropValue("cebxMerge", "type")),0); //转换方式
    int action = Util.getIntValue(Util.null2String(getPropValue("cebxMerge", "action")),0); //转换方式

    String fujian = "";

    public RequestFileCMInfo(){}

    public RequestFileCMInfo(int workflowid,int nodeid,int requestid,int formid){

        this.workflowid = workflowid;
        this.nodeid = nodeid;
        this.requestid = requestid;
        this.formid = formid;
        this.tablename = this.getTablename(formid);
        this.wfcmInfo = new WorkflowFileCMInfo(workflowid, nodeid);
    }

    public RequestFileCMInfo(int workflowid, int nodeid, int requestid, int formid, WorkflowFileCMInfo fcmInfo){

        this.workflowid = workflowid;
        this.nodeid = nodeid;
        this.requestid = requestid;
        this.formid = formid;
        this.tablename = this.getTablename(formid);
        this.wfcmInfo = fcmInfo;
    }

    public void init(){

        RecordSet set = new RecordSet();

        Nodeflag();
        ConvertMerge();
        String sql = "select * from "+this.tablename+" where requestid="+this.requestid+"";

        if(this.wfcmInfo.Qflag){ //可以合并

            set.executeSql(sql);
            if(set.next()){
                this.qpwjid = Util.getIntValue(set.getString(""+this.wfcmInfo.qfieldname),0);
                this.mainwejid = Util.null2String(set.getString(""+this.wfcmInfo.mainfieldname));

                String[] filenames = Util.TokenizerString2(this.wfcmInfo.ofieldname,","); //拆分多字段名称
                //获得文档ids
                for (int i = 0; i < filenames.length; i++) {
                    //文档ids
                    if(i==0){
                        this.owjids = Util.null2String(set.getString(filenames[i]));
                    }else{
                        this.owjids += "," + Util.null2String(set.getString(filenames[i]));
                    }
                }

                if(this.qpwjid>0){
                    this.ifQflag = true;
                }
            }

        }

        if(this.wfcmInfo.SignFlag){//可以签章

            set.executeSql(sql);
            if(set.next()){
                this.qsignattid = Util.getIntValue(set.getString(""+this.wfcmInfo.qsignfieldname),0);
                this.signattid = Util.getIntValue(set.getString(""+this.wfcmInfo.signfieldname),0);
                this.fujian = Util.null2String(set.getString(this.wfcmInfo.fujian));
                if(this.qsignattid>0){
                    this.ifSQflag = true;
                }
            }
        }

    }


    /**
     * 是否处理文件（合并，签章）
     */
    public void ConvertMerge(){

        if(this.type==2 && this.Nodeflag && this.wfcmInfo.Qflag){
            this.wfcmInfo.setQflag(true);
        }else if(this.type==1 && this.wfcmInfo.Qflag){
            this.wfcmInfo.setQflag(true);
        }else{
            this.wfcmInfo.setQflag(false);
        }

        if(this.action==1 && this.Nodeflag && this.wfcmInfo.SignFlag){
            this.wfcmInfo.setSignFlag(true);
        }else if(this.action==0 && this.wfcmInfo.SignFlag){
            this.wfcmInfo.setSignFlag(true);
        }else{
            this.wfcmInfo.setSignFlag(false);
        }

    }

    /**
     * 判断请求当前节点是否是 签批节点
     */
    public void Nodeflag(){

        int cnodeid = 0; //流程当前节点

        RecordSet set = new RecordSet();
        String sql = "select workflowid,requestid,currentnodeid,currentnodetype from workflow_requestbase " +
                " where requestid = "+Util.getIntValue(this.requestid+"", 0)+"  and currentnodetype not in(0,3)";
        set.executeSql(""+sql);
        if(set.next()){
            cnodeid = Util.getIntValue(set.getInt("currentnodeid")+"",0);
        }
        if(cnodeid==this.nodeid && cnodeid!=0){
            this.Nodeflag = true;
        }
    }

    /**
     * 根据表单id获取表单名称
     * @param formid 表单id
     * @return
     */
    public static String getTablename(int formid){

        String tabname = "";
        if(formid<0){

            tabname = "formtable_main_"+(formid*-1);
        }else{

            RecordSet set = new RecordSet();

            String sql = "select id,tablename from workflow_bill where id = "+formid;
            set.executeSql(sql);
            if(set.next()){
                tabname = set.getString("tablename");
            }
        }

        return tabname;
    }


    public WorkflowFileCMInfo getWfcmInfo() {
        return wfcmInfo;
    }

    public void setWfcmInfo(WorkflowFileCMInfo wfcmInfo) {
        this.wfcmInfo = wfcmInfo;
    }

    public int getQpwjid() {
        return qpwjid;
    }

    public void setQpwjid(int qpwjid) {
        this.qpwjid = qpwjid;
    }

    public String getOwjids() {
        return owjids;
    }

    public void setOwjids(String owjids) {
        this.owjids = owjids;
    }

    public String getMainwejid() {
        return mainwejid;
    }

    public void setMainwejid(String mainwejid) {
        this.mainwejid = mainwejid;
    }

    public int getSignattid() {
        return signattid;
    }

    public void setSignattid(int signattid) {
        this.signattid = signattid;
    }

    public int getQsignattid() {
        return qsignattid;
    }

    public void setQsignattid(int qsignattid) {
        this.qsignattid = qsignattid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    public boolean isNodeflag() {
        return Nodeflag;
    }
    public void setNodeflag(boolean nodeflag) {
        Nodeflag = nodeflag;
    }
    public int getFormid() {
        return formid;
    }
    public void setFormid(int formid) {
        this.formid = formid;
    }
    public String getTablename() {
        return tablename;
    }
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public int getWorkflowid() {
        return workflowid;
    }
    public void setWorkflowid(int workflowid) {
        this.workflowid = workflowid;
    }
    public int getNodeid() {
        return nodeid;
    }
    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
    }
    public int getRequestid() {
        return requestid;
    }
    public void setRequestid(int requestid) {
        this.requestid = requestid;
    }
    public boolean isIfQflag() {
        return ifQflag;
    }
    public void setIfQflag(boolean ifQflag) {
        this.ifQflag = ifQflag;
    }
    public boolean isIfSQflag() {
        return ifSQflag;
    }
    public void setIfSQflag(boolean ifSQflag) {
        this.ifSQflag = ifSQflag;
    }
    public boolean isIfQZCflag() {
        return ifQZCflag;
    }
    public void setIfQZCflag(boolean ifQZCflag) {
        this.ifQZCflag = ifQZCflag;
    }

    public String getFujian() {
        return fujian;
    }

    public void setFujian(String fujian) {
        this.fujian = fujian;
    }
}
