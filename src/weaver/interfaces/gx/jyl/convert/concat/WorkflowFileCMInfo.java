package weaver.interfaces.gx.jyl.convert.concat;

import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.conn.RecordSet;

/**
 * 流程合并文件信息类
 * @author Administrator
 *
 */
public class WorkflowFileCMInfo extends BaseBean{

    int id = 0;
    int workflowid = 0; //流程id
    int nodeid = 0;	//节点id
    String mainfieldname = ""; //主文件字段名称
    String ofieldname = "";	//附件字段名称
    String qfieldname = "";	//签批文件字段名称
    int doccategoryid = 0; //存放目录id
    int buttonid = 0;		//按钮字段id
    int ifinitialize = 0; //是否初始化
    int signnodeid = 0; //签章字段id
    String signfieldname = "";  //签章文档字段名称
    String qsignfieldname = "";//签章后文件字段名称
    int hbnodeid  = 0;

    /**
     * 判断改节点是否有合并
     */
    boolean Qflag = false;//判断改节点是否有合并
    boolean Cflag = false;//是否初始化

    boolean SignFlag = false; //判断该节点是否有签章
    String fujian = "";

    public WorkflowFileCMInfo(){

    }

    public WorkflowFileCMInfo(int workflowid,int nodeid){

        this.workflowid = workflowid;
        this.nodeid = nodeid;

        RecordSet set = new RecordSet();

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,doccategoryid,buttonid,ifinitialize,hbnodeid" +
                " from workflow_signbase where workflowid = " + Util.getIntValue(workflowid+"", 0)+" and nodeid="+Util.getIntValue(nodeid+"", 0);
        set.executeSql(sql);
        if(set.next()){

            this.id = set.getInt("id");
            this.mainfieldname = Util.null2String(set.getString("mainfieldname"));
            this.ofieldname = Util.null2String(set.getString("ofieldname"));
            this.qfieldname = Util.null2String(set.getString("qfieldname"));
            this.doccategoryid = set.getInt("doccategoryid");
            this.buttonid = set.getInt("buttonid");
            this.ifinitialize = set.getInt("ifinitialize");
            if(this.ifinitialize==1){
                this.Cflag = true;
            }else{
                this.Cflag = false;
            }
            this.hbnodeid = Util.getIntValue(set.getString("hbnodeid"), 0);
            this.Qflag = true;
        }

        sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,signnodeid,signfieldname,qsignfieldname,putinnodeid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid+"", 0)+" and signnodeid = "+Util.getIntValue(nodeid+"", 0);
        set.executeSql(sql);
        if(set.next()){
            this.buttonid = set.getInt("buttonid");
            this.signnodeid = set.getInt("signnodeid");
            this.signfieldname = Util.null2String(set.getString("signfieldname"));
            this.qsignfieldname = Util.null2String(set.getString("qsignfieldname"));
            this.SignFlag = true;
        }

        sql = "select id,workflowid,buttonid,signnodeid,signfieldname,qsignfieldname,putinnodeid" +
                " from workflow_signinfo where workflowid = "+Util.getIntValue(workflowid+"", 0)+" and signnodeid = "+Util.getIntValue(nodeid+"", 0);
        set.executeSql(sql);
        if(set.next()){
            this.buttonid = set.getInt("buttonid");
            this.signnodeid = set.getInt("signnodeid");
            this.signfieldname = Util.null2String(set.getString("signfieldname"));
            this.qsignfieldname = Util.null2String(set.getString("qsignfieldname"));
            this.SignFlag = true;
        }
    }


    public WorkflowFileCMInfo(int wsid){

        this.workflowid = workflowid;
        this.nodeid = nodeid;

        RecordSet set = new RecordSet();

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,doccategoryid,buttonid,ifinitialize,hbnodeid" +
                " from workflow_signbase where id = "+wsid;
        set.executeSql(sql);
        if(set.next()){

            this.workflowid = set.getInt("workflowid");
            this.nodeid = set.getInt("nodeid");
            this.id = set.getInt("id");
            this.mainfieldname = Util.null2String(set.getString("mainfieldname"));
            this.ofieldname = Util.null2String(set.getString("ofieldname"));
            this.qfieldname = Util.null2String(set.getString("qfieldname"));
            this.doccategoryid = set.getInt("doccategoryid");
            this.buttonid = set.getInt("buttonid");
            this.ifinitialize = set.getInt("ifinitialize");
            if(this.ifinitialize==1){
                this.Cflag = true;
            }else{
                this.Cflag = false;
            }
            this.hbnodeid = Util.getIntValue(set.getString("hbnodeid"), 0);

            this.Qflag = true;
        }

    }

    public WorkflowFileCMInfo (int workflowid,boolean falg){

        RecordSet set = new RecordSet();

        String sql = "select id,workflowid,buttonid,signnodeid,signfieldname,qsignfieldname,putinnodeid,fujian " +
                " from workflow_signinfo where workflowid = "+Util.getIntValue(workflowid+"", 0);

        //writeLog("[WorkflowFileCMInfo]"+sql);
        set.executeSql(sql);
        if(set.next()){
            this.buttonid = set.getInt("buttonid");
            this.signnodeid = set.getInt("signnodeid");
            this.signfieldname = Util.null2String(set.getString("signfieldname"));
            this.qsignfieldname = Util.null2String(set.getString("qsignfieldname"));
            this.workflowid = workflowid;
            this.nodeid = set.getInt("signnodeid");
            this.SignFlag = true;
            this.fujian = Util.null2String(set.getString("fujian"));
        }
    }


    public String getFujian() {
        return fujian;
    }

    public void setFujian(String fujian) {
        this.fujian = fujian;
    }

    public int getHbnodeid() {
        return hbnodeid;
    }

    public void setHbnodeid(int hbnodeid) {
        this.hbnodeid = hbnodeid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSignFlag() {
        return SignFlag;
    }

    public void setSignFlag(boolean signFlag) {
        SignFlag = signFlag;
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
    public String getMainfieldname() {
        return mainfieldname;
    }
    public void setMainfieldname(String mainfieldname) {
        this.mainfieldname = mainfieldname;
    }
    public String getOfieldname() {
        return ofieldname;
    }
    public void setOfieldname(String ofieldname) {
        this.ofieldname = ofieldname;
    }
    public String getQfieldname() {
        return qfieldname;
    }
    public void setQfieldname(String qfieldname) {
        this.qfieldname = qfieldname;
    }
    public int getDoccategoryid() {
        return doccategoryid;
    }
    public void setDoccategoryid(int doccategoryid) {
        this.doccategoryid = doccategoryid;
    }
    public int getButtonid() {
        return buttonid;
    }
    public void setButtonid(int buttonid) {
        this.buttonid = buttonid;
    }
    public int getIfinitialize() {
        return ifinitialize;
    }
    public void setIfinitialize(int ifinitialize) {
        this.ifinitialize = ifinitialize;
    }
    public int getSignnodeid() {
        return signnodeid;
    }
    public void setSignnodeid(int signnodeid) {
        this.signnodeid = signnodeid;
    }
    public String getSignfieldname() {
        return signfieldname;
    }
    public void setSignfieldname(String signfieldname) {
        this.signfieldname = signfieldname;
    }
    public String getQsignfieldname() {
        return qsignfieldname;
    }
    public void setQsignfieldname(String qsignfieldname) {
        this.qsignfieldname = qsignfieldname;
    }
    public boolean isQflag() {
        return Qflag;
    }
    public void setQflag(boolean qflag) {
        Qflag = qflag;
    }
    public boolean isCflag() {
        return Cflag;
    }
    public void setCflag(boolean cflag) {
        Cflag = cflag;
    }

}
