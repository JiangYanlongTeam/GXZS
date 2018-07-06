package weaver.interfaces.gx.jyl.convert;

import weaver.conn.RecordSet;
import weaver.docs.proce.CebFileUtil;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.company.DepartmentComInfo;
import weaver.hrm.company.SubCompanyComInfo;
import weaver.hrm.job.JobTitlesComInfo;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.ceb.FileConvertMerge;
import weaver.interfaces.swfa.BillFieldUtil;
import weaver.interfaces.swfa.WorkflowUtil;
import weaver.system.ceb.RequestFileCMInfo;
import weaver.system.ceb.WorkflowFileCMInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 流程文档，附件处理
 * author 衍  May 23, 2013
 *
 */
public class WorkflowFilePDF extends BaseBean{

    //private RecordSet recordSet=new RecordSet();
    //private RecordSet recordSet1=new RecordSet();
    private CebFileUtil fileUtil = new CebFileUtil();
    private BillFieldUtil bfUtil = new BillFieldUtil();
    private String strDestFolder = "D:\\ConvertService\\temp\\";

    /**
     * 获取正文文件信息
     * @param workflowid 流程id
     * @param requestid 请求id
     * @return Map hzname：后缀 fileHname：文件名称 fileTrueName：相对路径 fileRealPath：绝对路径
     */
    public Map getMainFile(String workflowid,String requestid){

        RecordSet recordSet=new RecordSet();
        RecordSet recordSet1=new RecordSet();

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int fileid = 0;
        int size = 0;
        int zsize = 0;
        String filename = "";

        //通过获取文档字段名称 查询文档id 查询相关信息
        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = " + Util.getIntValue(workflowid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){

            filename = Util.null2String(recordSet.getString("mainfieldname")); //字段名称
            if(!"".equals(filename)){
                String tablename = getTablename(workflowid); //表名
                String sql2 = "select "+filename+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0);
                recordSet1.executeSql(sql2);
                if(recordSet1.next()){

                    fileid = Util.getIntValue(recordSet1.getString(1), 0);//文档id

                    hzname = fileUtil.getDocSuffix(fileid+"");
                    fileHname = fileUtil.getDocFileNameN(fileid+"");
                    fileTrueName = fileUtil.getDocFileRealPath(fileid+"");
                    fileRealPath = fileUtil.getDocFilePath(fileid+"");
                    size = fileUtil.getDocSize(fileid+"");
                }
            }

        }

        if(hzname.toLowerCase().equals("cebx")){//是否cebx文件
            zsize = 0;
        }else{
            zsize = size;
        }

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);
        scheduleMap.put("size",size+"");
        scheduleMap.put("zsize", zsize+"");

        return scheduleMap;
    }

    /**
     * 获取正文文件信息
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param nodeid 节点id
     * @return Map hzname：后缀 fileHname：文件名称 fileTrueName：相对路径 fileRealPath：绝对路径
     */
    public Map getMainFile(String workflowid,String requestid,String nodeid){

        RecordSet recordSet=new RecordSet();
        RecordSet recordSet1=new RecordSet();

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int fileid = 0;
        int size = 0;
        int zsize = 0;
        String filename = "";

        //通过获取文档字段名称 查询文档id 查询相关信息
        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = " + Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){

            filename = Util.null2String(recordSet.getString("mainfieldname")); //字段名称
            if(!"".equals(filename)){
                String tablename = getTablename(workflowid); //表名
                String sql2 = "select "+filename+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0);
                recordSet1.executeSql(sql2);
                if(recordSet1.next()){

                    fileid = Util.getIntValue(recordSet1.getString(1), 0);//文档id

                    hzname = fileUtil.getDocSuffix(fileid+"");
                    fileHname = fileUtil.getDocFileNameN(fileid+"");
                    fileTrueName = fileUtil.getDocFileRealPath(fileid+"");
                    fileRealPath = fileUtil.getDocFilePath(fileid+"");
                    size = fileUtil.getDocSize(fileid+"");
                }
            }

        }

        if(hzname.toLowerCase().equals("cebx")){//是否cebx文件
            zsize = 0;
        }else{
            zsize = size;
        }

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);
        scheduleMap.put("size",size+"");
        scheduleMap.put("zsize", zsize+"");

        return scheduleMap;
    }

    /**
     * 获取附件文件信息
     * @param workflowid 流程id
     * @param requestid 请求id
     * @return Map hzname：后缀 fileHname：文件名称 fileTrueName：相对路径 fileRealPath：绝对路径
     */
    public Map getMuitFile(String workflowid,String requestid){

        RecordSet recordSet=new RecordSet();
        RecordSet recordSet1=new RecordSet();

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        String fileidstr = "";
        String filename = "";

        int size = 0;
        int zsize = 0;

        int ss = 0;

        //通过获取文档字段名称 查询文档id 查询相关信息
        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){


            filename = Util.null2String(recordSet.getString("ofieldname")); //字段名称 多字段
            if(!"".equals(filename)){

                String tablename = getTablename(workflowid); //表名
                //
                String sql2 = "select "+filename+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0);
                recordSet1.executeSql(sql2);
                if(recordSet1.next()){

                    String[] filenames = Util.TokenizerString2(filename,","); //拆分多字段名称
                    //获得文档ids
                    for (int i = 0; i < filenames.length; i++) {
                        //文档ids
                        if(i==0){
                            fileidstr = Util.null2String(recordSet1.getString(filenames[i]));
                        }else{
                            fileidstr += "," + Util.null2String(recordSet1.getString(filenames[i]));
                        }
                    }

                    //通过文档ids 得到相关信息
                    int fileid = 0;
                    int u = 0;
                    String[] fileids = Util.TokenizerString2(fileidstr,","); //拆分多文档id
                    for (int i = 0; i < fileids.length; i++) {

                        fileid = Util.getIntValue(fileids[i], 0);//文档id

                        if(fileid>0){//文档id大于0

                            ss = fileUtil.getDocSize(fileid+"");
                            size += ss;
                            String hz = fileUtil.getDocSuffix(fileid+"");
                            if(hz.toLowerCase().equals("cebx")){ //是否cebx文件
                                zsize += 0;
                            }else{
                                zsize += ss;
                            }

                            if(u==0){
                                hzname = hz;
                                fileHname = fileUtil.getDocFileNameN(fileid+"");
                                fileTrueName = fileUtil.getDocFileRealPath(fileid+"");
                                fileRealPath = fileUtil.getDocFilePath(fileid+"");
                            }else{

                                hzname += "," + hz;
                                fileHname += "," + fileUtil.getDocFileNameN(fileid+"");
                                fileTrueName += "," + fileUtil.getDocFileRealPath(fileid+"");
                                fileRealPath += "," + fileUtil.getDocFilePath(fileid+"");

                            }

                            u++;

                        }

                    }

                }
            }

        }


        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);
        scheduleMap.put("size",size+"");
        scheduleMap.put("zsize", zsize+"");

        return scheduleMap;

    }

    /**
     * 获取附件文件信息
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param nodeid 节点id
     * @return Map hzname：后缀 fileHname：文件名称 fileTrueName：相对路径 fileRealPath：绝对路径
     */
    public Map getMuitFile(String workflowid,String requestid,String nodeid){

        RecordSet recordSet=new RecordSet();
        RecordSet recordSet1=new RecordSet();

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        String fileidstr = "";
        String filename = "";

        int size = 0;
        int zsize = 0;
        int ss = 0;

        //通过获取文档字段名称 查询文档id 查询相关信息
        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){


            filename = Util.null2String(recordSet.getString("ofieldname")); //字段名称 多字段
            if(!"".equals(filename)){

                String tablename = getTablename(workflowid); //表名
                //
                String sql2 = "select "+filename+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0);
                recordSet1.executeSql(sql2);
                if(recordSet1.next()){

                    String[] filenames = Util.TokenizerString2(filename,","); //拆分多字段名称
                    //获得文档ids
                    for (int i = 0; i < filenames.length; i++) {
                        //文档ids
                        if(i==0){
                            fileidstr = Util.null2String(recordSet1.getString(filenames[i]));
                        }else{
                            fileidstr += "," + Util.null2String(recordSet1.getString(filenames[i]));
                        }
                    }

                    //通过文档ids 得到相关信息
                    int fileid = 0;
                    int u = 0;
                    String[] fileids = Util.TokenizerString2(fileidstr,","); //拆分多文档id
                    for (int i = 0; i < fileids.length; i++) {

                        fileid = Util.getIntValue(fileids[i], 0);//文档id

                        if(fileid>0){//文档id大于0

                            ss = fileUtil.getDocSize(fileid+"");
                            size += ss;
                            String hz = fileUtil.getDocSuffix(fileid+"");
                            if(hz.toLowerCase().equals("cebx")){ //是否cebx文件
                                zsize += 0;
                            }else{
                                zsize += ss;
                            }

                            if(u==0){
                                hzname = hz;
                                fileHname = fileUtil.getDocFileNameN(fileid+"");
                                fileTrueName = fileUtil.getDocFileRealPath(fileid+"");
                                fileRealPath = fileUtil.getDocFilePath(fileid+"");
                            }else{

                                hzname += "," + hz;
                                fileHname += "," + fileUtil.getDocFileNameN(fileid+"");
                                fileTrueName += "," + fileUtil.getDocFileRealPath(fileid+"");
                                fileRealPath += "," + fileUtil.getDocFilePath(fileid+"");

                            }

                            u++;
                        }

                    }

                }
            }

        }


        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);
        scheduleMap.put("size",size+"");
        scheduleMap.put("zsize",zsize+"");

        return scheduleMap;

    }


    /**
     * 获取签批文件信息
     * @param workflowid 流程id
     * @param requestid 请求id
     * @return Map hzname：后缀 fileHname：文件名称 fileTrueName：相对路径 fileRealPath：绝对路径
     */
    public Map getQFile(String workflowid,String requestid){

        RecordSet recordSet=new RecordSet();
        RecordSet recordSet1=new RecordSet();

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int fileid = 0;
        String filename = "";

        int size = 0;
        int zsize = 0;

        //通过获取文档字段名称 查询文档id 查询相关信息
        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = " + Util.getIntValue(workflowid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){

            filename = Util.null2String(recordSet.getString("qfieldname")); //字段名称
            if(!"".equals(filename)){
                String tablename = getTablename(workflowid); //表名
                String sql2 = "select "+filename+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0);
                recordSet1.executeSql(sql2);
                if(recordSet1.next()){

                    fileid = Util.getIntValue(recordSet1.getString(1), 0);//文档id

                    hzname = fileUtil.getDocSuffix(fileid+"");
                    fileHname = fileUtil.getDocFileNameN(fileid+"");
                    fileTrueName = fileUtil.getDocFileRealPath(fileid+"");
                    fileRealPath = fileUtil.getDocFilePath(fileid+"");
                    size = fileUtil.getDocSize(fileid+"");
                }
            }

        }

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);
        scheduleMap.put("size",size+"");
        scheduleMap.put("zsize", 0+"");

        return scheduleMap;
    }

    /**
     * 获取签批文件信息
     * @param workflowid 流程id
     * @param requestid 请求id
     * @return Map hzname：后缀 fileHname：文件名称 fileTrueName：相对路径 fileRealPath：绝对路径
     */
    public Map getQFile(String workflowid,String requestid,String nodeid){

        RecordSet recordSet=new RecordSet();
        RecordSet recordSet1=new RecordSet();

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int fileid = 0;
        String filename = "";

        int size = 0;
        int zsize = 0;

        //通过获取文档字段名称 查询文档id 查询相关信息
        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = " + Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){

            filename = Util.null2String(recordSet.getString("qfieldname")); //字段名称
            if(!"".equals(filename)){
                String tablename = getTablename(workflowid); //表名
                String sql2 = "select "+filename+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0);
                recordSet1.executeSql(sql2);
                if(recordSet1.next()){

                    fileid = Util.getIntValue(recordSet1.getString(1), 0);//文档id

                    hzname = fileUtil.getDocSuffix(fileid+"");
                    fileHname = fileUtil.getDocFileNameN(fileid+"");
                    fileTrueName = fileUtil.getDocFileRealPath(fileid+"");
                    fileRealPath = fileUtil.getDocFilePath(fileid+"");
                    size = fileUtil.getDocSize(fileid+"");
                }
            }

        }

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);
        scheduleMap.put("size",size+"");
        scheduleMap.put("zsize", size+"");
        scheduleMap.put("docid",fileid+"");

        return scheduleMap;
    }


    /**
     * 获取签章正文文件信息
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param nodeid 节点id
     * @return Map hzname：后缀 fileHname：文件名称 fileTrueName：相对路径 fileRealPath：绝对路径
     */
    public Map getSignMainFile(String workflowid,String requestid,String nodeid){

        RecordSet recordSet=new RecordSet();
        RecordSet recordSet1=new RecordSet();

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int fileid = 0;
        int size = 0;
        int zsize = 0;
        String filename = "";

        //通过获取文档字段名称 查询文档id 查询相关信息
        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,signnodeid,signfieldname,qsignfieldname" +
                " from workflow_signbase where workflowid = " + Util.getIntValue(workflowid, 0)+" and signnodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){

            filename = Util.null2String(recordSet.getString("signfieldname")); //字段名称
            if(!"".equals(filename)){
                String tablename = getTablename(workflowid); //表名
                String sql2 = "select "+filename+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0);
                recordSet1.executeSql(sql2);
                if(recordSet1.next()){

                    fileid = Util.getIntValue(recordSet1.getString(1), 0);//文档id

                    hzname = fileUtil.getDocSuffix(fileid+"");
                    fileHname = fileUtil.getDocFileNameN(fileid+"");
                    fileTrueName = fileUtil.getDocFileRealPath(fileid+"");
                    fileRealPath = fileUtil.getDocFilePath(fileid+"");
                    size = fileUtil.getDocSize(fileid+"");
                }
            }

        }

        if(hzname.toLowerCase().equals("cebx")){//是否cebx文件
            zsize = 0;
        }else{
            zsize = size;
        }

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);
        scheduleMap.put("size",size+"");
        scheduleMap.put("zsize", zsize+"");

        return scheduleMap;
    }

    /**
     * 获取节点id
     * @param workflowid 流程id
     * @return
     */
    public int getNodeid(String workflowid){

        RecordSet recordSet=new RecordSet();

        int nodeid = 0;

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            nodeid = recordSet.getInt("nodeid");
        }

        return nodeid;
    }

    /**
     * 获取按钮字段id
     * @param workflowid 流程id
     * @return
     */
    public int getButtonid(String workflowid){

        RecordSet recordSet=new RecordSet();

        int buttonid = 0;

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            buttonid = recordSet.getInt("buttonid");
        }

        return buttonid;
    }

    /**
     * 获取文档目录id
     * @param workflowid 流程id
     * @return
     */
    public int getDoccategoryid(String workflowid){

        RecordSet recordSet=new RecordSet();

        int doccategoryid = 0;

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,doccategoryid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            doccategoryid = recordSet.getInt("doccategoryid");
        }

        return doccategoryid;
    }

    /**
     * 获取文档目录id
     * @param workflowid 流程id
     * @param nodeid 节点id
     * @return
     */
    public int getDoccategoryid(String workflowid,String nodeid){

        RecordSet recordSet=new RecordSet();

        int doccategoryid = 0;

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,doccategoryid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            doccategoryid = recordSet.getInt("doccategoryid");
        }

        return doccategoryid;
    }

    /**
     * 获取签批文件字段名称
     * @param workflowid 流程id
     * @return
     */
    public String getQfieldname(String workflowid){

        RecordSet recordSet=new RecordSet();

        String fieldname = "";

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            fieldname = Util.null2String(recordSet.getString("qfieldname"));
        }

        return fieldname;

    }

    /**
     * 获取签批文件字段名称
     * @param workflowid 流程id
     * @param nodeid 节点id
     * @return
     */
    public String getQfieldname(String workflowid, String nodeid){

        RecordSet recordSet=new RecordSet();

        String fieldname = "";

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            fieldname = Util.null2String(recordSet.getString("qfieldname"));
        }

        return fieldname;

    }

    /**
     * 获取签章文件字段名称
     * @param workflowid 流程id
     * @param nodeid 节点id
     * @return
     */
    public String getSignQfieldname(String workflowid, String nodeid){

        RecordSet recordSet=new RecordSet();

        String fieldname = "";

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,signnodeid,signfieldname,qsignfieldname" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and signnodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            fieldname = Util.null2String(recordSet.getString("qsignfieldname"));
        }

        return fieldname;

    }

    /**
     * 获取表单名称
     * @param workflowid 流程id
     * @return
     */
    public String getTablename(String workflowid){
        RecordSet recordSet=new RecordSet();

        String tablename = "";

        String sql = "select b.tablename from workflow_base a,workflow_bill b" +
                " where a.formid = b.id and a.id = "+Util.getIntValue(workflowid, 0);

        recordSet.executeSql(sql);
        if(recordSet.next()){
            tablename = Util.null2String(recordSet.getString("tablename"));
        }

        return tablename;
    }

    /**
     * 更新文件到流程中
     * @param workflowid
     * @param requestid
     * @param docid
     * @return
     */
    public boolean UpdateWfQFile(String workflowid,String requestid,String docid){

        RecordSet recordSet=new RecordSet();
        boolean flag = true;
        String tablename = getTablename(workflowid);
        String fname = getQfieldname(workflowid);

        String sql = "update "+tablename+" set "+fname+"='"+docid+"' where requestid="+Util.getIntValue(requestid, 0);
        flag = recordSet.executeSql(sql);

        return flag;
    }

    /**
     * 更新签章文件到流程中
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param docid  文档id
     * @param fieldname 字段名
     * @param formid  表单id
     * @param flag 是否增加
     * @return
     */
    public boolean UpdateWfFileAll(String workflowid,String requestid,String docid,String fieldname,int formid,boolean falg){

        RecordSet recordSet=new RecordSet();
        boolean flag = true;
        String tablename = getTablename(workflowid);
        String ff = "";
        recordSet.executeSql("select "+fieldname+" from "+tablename+" where requestid="+Util.getIntValue(requestid, 0));
        if(recordSet.next()){
            ff = Util.null2String(recordSet.getString(fieldname));
        }
        if(!"".equals(ff)){
            ff += ","+docid;
        }else{
            ff = docid;
        }
        if(!falg){
            ff = docid;
        }

        String sql = "update "+tablename+" set "+fieldname+"='"+ff+"' where requestid="+Util.getIntValue(requestid, 0);

        writeLog("UpdateWfFileAll[sql:"+sql+"]");
        flag = recordSet.executeSql(sql);

        return flag;
    }

    /**
     * 更新文件到流程中
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param docid  文档id
     * @param nodeid 节点id
     * @return
     */
    public boolean UpdateWfQFile(String workflowid,String requestid,String docid,String nodeid){

        RecordSet recordSet=new RecordSet();
        boolean flag = true;
        String tablename = getTablename(workflowid);
        String fname = getQfieldname(workflowid,nodeid);

        String sql = "update "+tablename+" set "+fname+"='"+docid+"' where requestid="+Util.getIntValue(requestid, 0);
        flag = recordSet.executeSql(sql);

        return flag;
    }

    /**
     * 更新签章文件到流程中
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param docid  文档id
     * @param nodeid 节点id
     * @return
     */
    public boolean UpdateWfSignQFile(String workflowid,String requestid,String docid,String nodeid){

        RecordSet recordSet=new RecordSet();
        boolean flag = true;
        String tablename = getTablename(workflowid);
        WorkflowFileCMInfo cmInfo = new WorkflowFileCMInfo(Util.getIntValue(workflowid,0),Util.getIntValue(nodeid,0));
        String fname = cmInfo.getQsignfieldname();

        String sql = "update "+tablename+" set "+fname+"='"+docid+"' where requestid="+Util.getIntValue(requestid, 0);
        flag = recordSet.executeSql(sql);

        return flag;
    }

    /**
     * 把上传的合并文件 创建成附件 保存到流程中
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param imageFileName 文件名称
     * @param fileRealPath 文件绝对路径
     * @param userid 用户id
     */
    public void saveQFile(String workflowid,String requestid,String imageFileName,String fileRealPath,String userID,String upassword){

        String categoryid = getDoccategoryid(workflowid)+"";

        //创建附件
        String docid = fileUtil.createDoc(imageFileName, fileRealPath, userID, upassword, categoryid);

        //更新到流程中
        if(Util.getIntValue(docid, 0)>0){

            UpdateWfQFile(workflowid,requestid,docid);
        }
    }

    /**
     * 把上传的签章文件 创建成附件 保存到流程中
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param imageFileName 文件名称
     * @param fileRealPath 文件绝对路径
     * @param userid 用户id
     * @param nodeid 节点id
     */
    public void saveSignQFile(String workflowid,String requestid,String imageFileName,String fileRealPath,String userID,String upassword,String nodeid){

        String categoryid = fileUtil.getDocCategory(workflowid, 0);
        if(categoryid.lastIndexOf(",")>0){
            categoryid = categoryid.substring(categoryid.lastIndexOf(",")+1);
        }

        //创建附件
        String docid = fileUtil.createDoc(imageFileName, fileRealPath, userID, upassword, categoryid);

        //更新到流程中
        if(Util.getIntValue(docid, 0)>0){

            UpdateWfSignQFile(workflowid,requestid,docid,nodeid);
        }
    }

    /**
     * 把上传的签章文件 创建成附件 保存到流程中
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param imageFileName 文件名称
     * @param fileRealPath 文件绝对路径
     * @param userid 用户id
     * @param fieldname 字段名称
     * @param formid 表单id
     * @param flag  附件值  true-增加  false-覆盖
     */
    public void saveFileAll(String workflowid,String requestid,String imageFileName,String fileRealPath,String userID,String upassword,String fieldname,int formid,boolean flag){

        String categoryid = fileUtil.getDocCategory(workflowid, 0);
        if(categoryid.lastIndexOf(",")>0){
            categoryid = categoryid.substring(categoryid.lastIndexOf(",")+1);
        }



        //创建附件
        String docid = fileUtil.createDoc(imageFileName, fileRealPath, userID, upassword, categoryid);

        writeLog("workflowid["+workflowid+"] categoryid["+categoryid+"] docid["+docid+"]");
        //更新到流程中
        if(Util.getIntValue(docid, 0)>0){

            UpdateWfFileAll(workflowid,requestid,docid,fieldname,formid,flag);
        }
    }

    /**
     * 把上传的合并文件 创建成附件 保存到流程中
     * @param workflowid 流程id
     * @param requestid 请求id
     * @param imageFileName 文件名称
     * @param fileRealPath 文件绝对路径
     * @param userid 用户id
     * @param nodeid 节点id
     */
    public void saveQFile(String workflowid,String requestid,String imageFileName,String fileRealPath,String userID,String upassword,String nodeid){

        String categoryid = getDoccategoryid(workflowid,nodeid)+"";

        //创建附件
        String docid = fileUtil.createDoc(imageFileName, fileRealPath, userID, upassword, categoryid);

        //更新到流程中
        if(Util.getIntValue(docid, 0)>0){

            UpdateWfQFile(workflowid,requestid,docid,nodeid);
        }
    }

    /**
     * 获取字段值
     * @param requestid 请求id
     * @param fieldname	字段名
     * @param formid 表单id
     * @return
     */
    public String getFieldValue(String requestid,String fieldname,String formid){

        RecordSet recordSet=new RecordSet();

        String value = "";

        formid = Util.getIntValue(formid)*-1+"";

        String sql = "select "+fieldname+" from formtable_main_"+formid+" where requestid="+Util.getIntValue(requestid, 0)+"";
        recordSet.executeSql(sql);
        if(recordSet.next()){
            value = recordSet.getString(fieldname);
        }

        return value;
    }

    /**
     * 获取字段值
     * @param requestid 请求id
     * @param fieldname	字段名
     * @param formid 表单id
     * @return
     */
    public Map getFieldValue(String requestid,List fieldnames,String formid){

        RecordSet recordSet=new RecordSet();

        Map values = new HashMap();


        formid = Util.getIntValue(formid)*-1+"";

        String sql = "select * from formtable_main_"+formid+" where requestid="+Util.getIntValue(requestid, 0)+"";
        recordSet.executeSql(sql);
        if(recordSet.next()){

            for (int i = 0; i < fieldnames.size(); i++) {

                if(fieldnames.get(i)==null || "".equals(fieldnames.get(i))){
                    continue;
                }

                values.put(fieldnames.get(i), Util.null2String(recordSet.getString(fieldnames.get(i)+"")));
            }
        }

        return values;
    }

    /**
     * 获取某节点签字意见   文本
     * @param requestid
     * @param nodeid
     * @return
     */
    public String getrequestLog(String requestid,String nodeid){

        RecordSet recordSet=new RecordSet();
        String logs = "";

        ResourceComInfo resourceComInfo =null;
        DepartmentComInfo departmentComInfo =null;
        JobTitlesComInfo jobTitlesComInfo = null;
        try {
            resourceComInfo= new ResourceComInfo();
            departmentComInfo = new DepartmentComInfo();
            jobTitlesComInfo = new JobTitlesComInfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String sql = "select * from workflow_requestlog where requestid="+Util.getIntValue(requestid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0)+" order by logid desc";
        recordSet.executeSql(sql);
        if(recordSet.next()){
            String userid = recordSet.getString("operator");
            String operatorDept = resourceComInfo.getDepartmentID(userid);

            float tempseclevel = Float.parseFloat(resourceComInfo.getSeclevel(""+userid));
            String tempsubcanyid = departmentComInfo.getSubcompanyid1(""+operatorDept);//单位id

            String logstr = recordSet.getString("remark");
            //String bm = departmentComInfo.getDepartmentname(resourceComInfo.getDepartmentID(recordSet.getString("operator")));
            String lastname = resourceComInfo.getResourcename(recordSet.getString("operator")) ;
            String operatedate = recordSet.getString("operatedate");
            String gw = resourceComInfo.getJobTitle(recordSet.getString("operator"));

            logstr = Util.replaceHtml(logstr);

            logstr = this.delHTMLTag(logstr);

            if(tempseclevel>=50 || "110".equals(tempsubcanyid)){
                gw = jobTitlesComInfo.getJobTitlesname(gw);
            }else{
                gw = "";
            }

            logs += ""+logstr +"   ---"+gw+" "+lastname+" "+operatedate;
        }

        return logs;
    }

    /**
     * 获取某节点签字意见  文本 和图片
     * @param requestid
     * @param nodeid
     * @return
     */
    public Map getrequestLogMap(String requestid,String nodeid,int logtype,int fieldid){

        RecordSet recordSet=new RecordSet();
        RecordSet rst=new RecordSet();
        String logs = "";

        Map map = new HashMap();

        ResourceComInfo resourceComInfo =null;
        DepartmentComInfo departmentComInfo =null;
        JobTitlesComInfo jobTitlesComInfo = null;
        try {
            resourceComInfo= new ResourceComInfo();
            departmentComInfo = new DepartmentComInfo();
            jobTitlesComInfo = new JobTitlesComInfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //writeLog("getrequestLogMap:"+requestid+"  :"+nodeid);

        String sql = "select * from workflow_requestlog where requestid="+Util.getIntValue(requestid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0)+" order by operatedate,operatetime";
        if(logtype==9){
            sql = "select * from workflow_requestlog where requestid="+Util.getIntValue(requestid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0)+" and logtype='"+logtype+"' order by operatedate,operatetime";
        }

        recordSet.executeSql(sql);

        //writeLog("getrequestLogMap:"+sql);
        while(recordSet.next()){

            //writeLog("getrequestLogMap:1:");
            String userid = recordSet.getString("operator");

            String operatorDept = resourceComInfo.getDepartmentID(userid);

            float tempseclevel = Float.parseFloat(resourceComInfo.getSeclevel(""+userid));
            String tempsubcanyid = departmentComInfo.getSubcompanyid1(""+operatorDept);//单位id

            String logstr = recordSet.getString("remark");
            String bm = departmentComInfo.getDepartmentname(resourceComInfo.getDepartmentID(userid));
            String lastname = resourceComInfo.getResourcename(userid) ;
            String operatedate = recordSet.getString("operatedate");
            String operatetime = recordSet.getString("operatetime");
            String logid = recordSet.getString("logid");

            String gw = resourceComInfo.getJobTitle(userid);

            if(tempseclevel>=50 || "110".equals(tempsubcanyid)){
                gw = jobTitlesComInfo.getJobTitlesname(gw);
            }else{
                gw = "";
            }

            if(logtype==9){
                int xzfieldid = 0;
                rst.executeSql("select xzfieldid from workflow_CurrentOperator where requestid="+requestid+" and nodeid="+nodeid+" and operatedate='"+operatedate+"' and xzfieldid="+fieldid+" and userid="+userid);
                //writeLog("getrequestLogMap"+"select xzfieldid from workflow_CurrentOperator where requestid="+requestid+" and nodeid="+nodeid+" and operatedate='"+operatedate+"' and userid="+userid);
                if(rst.next()){
                    xzfieldid = Util.getIntValue(rst.getString("xzfieldid"),0);
                }

                if(xzfieldid!=fieldid){
                    continue;
                }
            }

            logstr = Util.replaceHtml(logstr);

            logstr = this.delHTMLTag(logstr);

            //logs += ""+logstr +"   ---"+bm+" "+lastname+" "+operatedate;

            //Map map1 = this.getRequestLogImgOperator( requestid, nodeid,userid);
            Map map1 = this.getRequestLogIDImg( requestid, nodeid,logid);
            if(map1==null){
                map.put(userid, ""+logstr +"   ---"+gw+" "+lastname+" "+operatedate);
            }else{
                map1.put("bz","  ---"+gw+" "+lastname+" "+operatedate);
                map.put(userid+"img", map1);
                //map.put(userid+"imgbz", );
            }

            //writeLog("getrequestLogMap:1:"+userid +" "+logstr);

        }

        return map;
    }

    /**
     * 获取某节点签字意见   操作人员集合 （是文本 或图片）
     * @param requestid
     * @param nodeid
     * @return
     */
    public List getrequestLogList(String requestid,String nodeid,int logtype,int fieldid){

        RecordSet recordSet=new RecordSet();
        String logs = "";

        Map map = new HashMap();
        List list = new ArrayList();
        RecordSet rst=new RecordSet();

//		ResourceComInfo resourceComInfo =null;
//		DepartmentComInfo departmentComInfo =null;
//		try {
//			resourceComInfo= new ResourceComInfo();
//			departmentComInfo = new DepartmentComInfo();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

        //writeLog("getrequestLogList:"+requestid+"  :"+nodeid);

        String sql = "select * from workflow_requestlog where requestid="+Util.getIntValue(requestid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0)+" order by operatedate,operatetime";
        if(logtype==9){
            sql = "select * from workflow_requestlog where requestid="+Util.getIntValue(requestid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0)+" and logtype='"+logtype+"' order by operatedate,operatetime";
        }

        recordSet.executeSql(sql);

        //writeLog("getrequestLogList:"+sql);
        while(recordSet.next()){

            //writeLog("getrequestLogMap:1:");
            String userid = recordSet.getString("operator");
            //String logstr = recordSet.getString("remark");
            //String bm = departmentComInfo.getDepartmentname(resourceComInfo.getDepartmentID(userid));
            //String lastname = resourceComInfo.getResourcename(userid) ;
            //String operatedate = recordSet.getString("operatedate");
            String operatedate = recordSet.getString("operatedate");
            String operatetime = recordSet.getString("operatetime");
            String logid = recordSet.getString("logid");

            if(logtype==9){
                int xzfieldid = 0;
                rst.execute("select xzfieldid from workflow_CurrentOperator where requestid="+requestid+" and nodeid="+nodeid+" and operatedate='"+operatedate+"' and xzfieldid="+fieldid+" and userid="+userid);
                //writeLog("getrequestLogList"+"select xzfieldid from workflow_CurrentOperator where requestid="+requestid+" and nodeid="+nodeid+" and operatedate='"+operatedate+"' and userid="+userid);
                if(rst.next()){
                    xzfieldid = Util.getIntValue(rst.getString("xzfieldid"),0);
                }

                if(xzfieldid!=fieldid){
                    continue;
                }
            }

            //logstr = Util.replaceHtml(logstr);

            //logstr = this.delHTMLTag(logstr);

            //logs += ""+logstr +"   ---"+bm+" "+lastname+" "+operatedate;

            //Map map1 = this.getRequestLogImgOperator( requestid, nodeid,userid);
            Map map1 = this.getRequestLogIDImg( requestid, nodeid,logid);
            if(map1==null){
                //map.put(userid, ""+logstr +"   ---"+bm+" "+lastname+" "+operatedate);
                list.add(userid);
            }else{
                //map.put(userid+"img", map1);
                list.add(userid+"img");
            }

            //writeLog("getrequestLogList:1:"+userid);

        }

        return list;
    }

    /**
     * 获取某节点签字意见图片路径
     * @param requestid
     * @param nodeid
     * @return
     */
    public Map getRequestLogImg(String requestid,String nodeid){
        RecordSet recordSet=new RecordSet();

        String imgpath = "";

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int u = 0;

        String sql = "select c.filerealpath,c.imagefileid,a.requestid,a.nodeid,a.operator from workflow_requestlog a,Workflow_FormSignRemark b,imagefile c " +
                "where a.requestlogid=b.requestlogid and b.imagefileid=c.imagefileid and a.requestid="+Util.getIntValue(requestid, 0)+" and a.nodeid="+Util.getIntValue(nodeid, 0)+" order by c.imagefileid";
        recordSet.executeSql(sql);
        while(recordSet.next()){

            int imagefileid = recordSet.getInt("imagefileid");

            if(imagefileid>0){

                if(u==0){
                    hzname = fileUtil.getImageSuffix(imagefileid+"");
                    fileHname = fileUtil.getImageFileNameN(imagefileid+"");
                    fileTrueName = fileUtil.getImageFileRealPath(imagefileid+"");
                    //fileRealPath = fileUtil.getImageFilePath(imagefileid+"");
                }else{

                    hzname += "," + fileUtil.getImageSuffix(imagefileid+"");
                    fileHname += "," + fileUtil.getImageFileNameN(imagefileid+"");
                    fileTrueName += "," + fileUtil.getImageFileRealPath(imagefileid+"");
                    //fileRealPath += "," + fileUtil.getImageFilePath(imagefileid+"");

                }

                u++;
            }

        }

        fileTrueName = fileTrueName.replace("\\","/");

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);

        if(u==0){
            scheduleMap = null;
        }

        return scheduleMap;
    }

    /**
     * 获取某节点 某个人签字意见图片路径
     * @param requestid
     * @param nodeid
     * @return
     */
    public Map getRequestLogImgOperator(String requestid,String nodeid,String operator){
        RecordSet recordSet=new RecordSet();

        String imgpath = "";

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int u = 0;

        String sql = "select c.filerealpath,c.imagefileid,a.requestid,a.nodeid,a.operator from workflow_requestlog a,Workflow_FormSignRemark b,imagefile c " +
                "where a.requestlogid=b.requestlogid and b.imagefileid=c.imagefileid and a.requestid="+Util.getIntValue(requestid, 0)+" and a.nodeid="+Util.getIntValue(nodeid, 0)+" and operator="+Util.getIntValue(operator, 0)+" order by c.imagefileid desc";
        recordSet.executeSql(sql);
        if(recordSet.next()){

            int imagefileid = recordSet.getInt("imagefileid");

            if(imagefileid>0){

                hzname = fileUtil.getImageSuffix(imagefileid+"");
                fileHname = fileUtil.getImageFileNameN(imagefileid+"");
                fileTrueName = fileUtil.getImageFileRealPath(imagefileid+"");
                //fileRealPath = fileUtil.getImageFilePath(imagefileid+"");
                u++;
            }

        }

        fileTrueName = fileTrueName.replace("\\","/");

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);

        if(u==0){
            scheduleMap = null;
        }

        return scheduleMap;
    }

    /**
     * 获取某节点 某个人签字意见图片路径
     * @param requestid
     * @param nodeid
     * @return
     */
    public Map getRequestLogIDImg(String requestid,String nodeid,String logid){
        RecordSet recordSet=new RecordSet();

        String imgpath = "";

        Map scheduleMap=new HashMap();

        String hzname="";
        String fileHname="";
        String fileTrueName="";
        String fileRealPath="";
        int u = 0;

        String sql = "select c.filerealpath,c.imagefileid,a.requestid,a.nodeid,a.operator from workflow_requestlog a,Workflow_FormSignRemark b,imagefile c " +
                "where a.requestlogid=b.requestlogid and b.imagefileid=c.imagefileid and a.requestid="+Util.getIntValue(requestid, 0)+" and a.nodeid="+Util.getIntValue(nodeid, 0)+" and logid="+Util.getIntValue(logid, 0)+" order by c.imagefileid desc";
        recordSet.executeSql(sql);
        if(recordSet.next()){

            int imagefileid = recordSet.getInt("imagefileid");

            if(imagefileid>0){

                hzname = fileUtil.getImageSuffix(imagefileid+"");
                fileHname = fileUtil.getImageFileNameN(imagefileid+"");
                fileTrueName = fileUtil.getImageFileRealPath(imagefileid+"");
                //fileRealPath = fileUtil.getImageFilePath(imagefileid+"");
                u++;
            }

        }

        fileTrueName = fileTrueName.replace("\\","/");

        scheduleMap.put("hzname", hzname);
        scheduleMap.put("fileHname", fileHname);
        scheduleMap.put("fileTrueName", fileTrueName);
        scheduleMap.put("fileRealPath", fileRealPath);

        if(u==0){
            scheduleMap = null;
        }

        return scheduleMap;
    }


    /**
     * 去掉字符串html标签
     * @param htmlStr
     * @return
     */
    public String delHTMLTag(String htmlStr){
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式

        //String regEx_ = "\\t|\r|\n"; //定义去除字符串中的空格、回车、换行符、制表符
        /*
		注：\n 回车(\u000a)
        	\t 水平制表符(\u0009)
        	\s 空格(\u0008)
        	\r 换行(\u000d)
        */


        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE);
        Matcher m_script=p_script.matcher(htmlStr);
        htmlStr=m_script.replaceAll(""); //过滤script标签

        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
        Matcher m_style=p_style.matcher(htmlStr);
        htmlStr=m_style.replaceAll(""); //过滤style标签

        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
        Matcher m_html=p_html.matcher(htmlStr);
        htmlStr=m_html.replaceAll(""); //过滤html标签

        htmlStr = htmlStr.replaceAll("\n", "");
        htmlStr = htmlStr.replaceAll("\r", "");

        return htmlStr.trim(); //返回文本字符串
    }

    /**
     * 去掉字符串html标签
     * @param htmlStr
     * @return
     */
    public String delHTMLTag2(String htmlStr){
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式

        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE);
        Matcher m_script=p_script.matcher(htmlStr);
        htmlStr=m_script.replaceAll(""); //过滤script标签

        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
        Matcher m_style=p_style.matcher(htmlStr);
        htmlStr=m_style.replaceAll(""); //过滤style标签

        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
        Matcher m_html=p_html.matcher(htmlStr);
        htmlStr=m_html.replaceAll(""); //过滤html标签

        return htmlStr.trim(); //返回文本字符串
    }

    /**
     * 流程该节点是否有合并信息
     * @param workflowid
     * @param requestid
     * @param nodeid
     * @return
     */
    public boolean IsConvertY(String workflowid,String requestid,String nodeid){
        RecordSet recordSet=new RecordSet();

        boolean falg = false;

        int Anodeid = 0; //签批节点
        int cnodeid = 0; //流程当前节点
        int dnodeid = Util.getIntValue(nodeid, 0);

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and nodeid = "+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            Anodeid = Util.getIntValue(recordSet.getInt("nodeid")+"",0);
        }

        //recordSet.writeLog(Anodeid+"   "+cnodeid+" ");

        if(Anodeid==dnodeid && dnodeid!=0){
            falg = true;
        }

        return falg;
    }

    /**
     * 是否合并文件
     * @param workflowid
     * @param requestid
     * @param nodeid
     * @return
     */
    public boolean IsConvert(String workflowid,String requestid,String nodeid){
        RecordSet recordSet=new RecordSet();

        boolean falg = false;

        int Anodeid = 0; //签批节点
        int cnodeid = 0; //流程当前节点
        int dnodeid = Util.getIntValue(nodeid, 0);

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and nodeid = "+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            Anodeid = Util.getIntValue(recordSet.getInt("nodeid")+"",0);
        }

        sql = "select workflowid,requestid,currentnodeid,currentnodetype from workflow_requestbase " +
                " where requestid = "+Util.getIntValue(requestid, 0)+"  and currentnodetype not in(0,3)";
        recordSet.executeSql(sql);
        if(recordSet.next()){
            cnodeid = Util.getIntValue(recordSet.getInt("currentnodeid")+"",0);
        }

        //recordSet.writeLog(Anodeid+"   "+cnodeid+" ");

        if(Anodeid==dnodeid && cnodeid==dnodeid && dnodeid!=0){
            falg = true;
        }

        return falg;
    }

    /**
     * 是否签章
     * @param workflowid
     * @param requestid
     * @param nodeid
     * @return
     */
    public boolean IsSign(String workflowid,String requestid,String nodeid){
        RecordSet recordSet=new RecordSet();

        boolean falg = false;

        int Anodeid = 0; //签批节点
        int cnodeid = 0; //流程当前节点
        int dnodeid = Util.getIntValue(nodeid, 0);

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,signnodeid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and signnodeid = "+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            Anodeid = Util.getIntValue(recordSet.getInt("signnodeid")+"",0);
        }

        sql = "select workflowid,requestid,currentnodeid,currentnodetype from workflow_requestbase " +
                " where requestid = "+Util.getIntValue(requestid, 0)+"  and currentnodetype not in(0,3)";
        recordSet.executeSql(sql);
        if(recordSet.next()){
            cnodeid = Util.getIntValue(recordSet.getInt("currentnodeid")+"",0);
        }

        //recordSet.writeLog(Anodeid+"   "+cnodeid+" ");

        if(Anodeid==dnodeid && cnodeid==dnodeid && dnodeid!=0){
            falg = true;
        }

        return falg;
    }

    /**
     * 是否发文入库
     * @param workflowid
     * @param requestid
     * @param nodeid
     * @return
     */
    public boolean IsPutin(String workflowid,String requestid,String nodeid){
        RecordSet recordSet=new RecordSet();

        boolean falg = false;

        int Anodeid = 0; //签批节点
        int cnodeid = 0; //流程当前节点
        int dnodeid = Util.getIntValue(nodeid, 0);

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,signnodeid,putinnodeid" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and putinnodeid = "+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            Anodeid = Util.getIntValue(recordSet.getInt("putinnodeid")+"",0);
        }

        sql = "select workflowid,requestid,currentnodeid,currentnodetype from workflow_requestbase " +
                " where requestid = "+Util.getIntValue(requestid, 0)+"  and currentnodetype not in(0,3)";
        recordSet.executeSql(sql);
        if(recordSet.next()){
            cnodeid = Util.getIntValue(recordSet.getInt("currentnodeid")+"",0);
        }

        //recordSet.writeLog(Anodeid+"   "+cnodeid+" ");

        if(Anodeid==dnodeid && cnodeid==dnodeid && dnodeid!=0){
            falg = true;
        }

        return falg;
    }

    /**
     * 是否初始化
     * @param workflowid
     * @param nodeid
     * @return
     */
    public boolean IfInitialize(String workflowid,String nodeid){
        RecordSet recordSet=new RecordSet();

        boolean falg = false;

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,ifinitialize" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and nodeid = "+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            int ifinitialize = recordSet.getInt("ifinitialize");
            if(ifinitialize==1){
                falg = true;
            }
        }

        return falg;
    }

    /**
     * 签批文件是否已存在
     * @param workflowid
     * @param requestid
     * @param nodeid
     * @return
     */
    public boolean IfQfile(String workflowid,String requestid,String nodeid,int formid){
        RecordSet recordSet=new RecordSet();

        String qfieldname = "";

        boolean falg = false;
        formid = formid * -1;

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,ifinitialize" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and nodeid = "+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            qfieldname = recordSet.getString("qfieldname");
        }
        if(qfieldname!=null && !"".equals(qfieldname)){
            sql = "select * from formtable_main_"+formid+" where requestid="+Util.getIntValue(requestid, 0)+"";
            recordSet.executeSql(sql);
            if(recordSet.next()){
                qfieldname = recordSet.getString(qfieldname);
                if(qfieldname!=null && !"".equals(qfieldname)){
                    falg = true;
                }
            }
        }

        return falg;
    }

    /**
     * 签章文件是否已存在
     * @param workflowid
     * @param requestid
     * @param nodeid
     * @return
     */
    public boolean IfSignQfile(String workflowid,String requestid,String nodeid,int formid){
        RecordSet recordSet=new RecordSet();

        String qfieldname = "";

        boolean falg = false;
        formid = formid * -1;

        String sql = "select id,workflowid,nodeid,mainfieldname,ofieldname,qfieldname,buttonid,ifinitialize,signnodeid,signfieldname,qsignfieldname" +
                " from workflow_signbase where workflowid = "+Util.getIntValue(workflowid, 0)+" and signnodeid = "+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        if(recordSet.next()){
            qfieldname = recordSet.getString("qsignfieldname");
        }
        if(qfieldname!=null && !"".equals(qfieldname)){
            sql = "select * from formtable_main_"+formid+" where requestid="+Util.getIntValue(requestid, 0)+"";
            recordSet.executeSql(sql);
            if(recordSet.next()){
                qfieldname = recordSet.getString(qfieldname);
                if(qfieldname!=null && !"".equals(qfieldname)){
                    falg = true;
                }
            }
        }

        return falg;
    }

    /**
     * DOC文档转为CEBX文件
     * @param fileurl
     * @param nDestFileType 文件类型， 0为PDF ，1为CEB，2为CEBX。
     * @param size
     * @return 返回jobid
     */
    public String ConvertFile_JobID(String fileurl,int nDestFileType,int size){

        String ResultUrl = "";

        FileConvertMerge merge = new FileConvertMerge();
        merge.init();
        ResultUrl = merge.ConvertFile_JobID(fileurl, nDestFileType, size);

        return ResultUrl;
    }

    /**
     * DOC文档转为CEBX文件
     * @param fileurl
     * @param nDestFileType 文件类型， 0为PDF ，1为CEB，2为CEBX。
     * @param size
     * @return 返回文件路径
     */
    public String ConvertFile_JobResult(String fileurl,int nDestFileType,int size){

        String ResultUrl = "";

        FileConvertMerge merge = new FileConvertMerge();
        merge.init();
        ResultUrl = merge.ConvertFile_JobResult(fileurl, nDestFileType, size);

        return ResultUrl;
    }

    /**
     * 文件合并
     * @param fileurl
     * @param nDestFileType 文件类型， 0为PDF ，1为CEB，2为CEBX。
     * @param size
     * @return 返回jobid
     */
    public String ConcatFiles_JobID(String fileurl,int nDestFileType,int size){

        String ResultUrl = "";

        ConvertMergePDF merge = new ConvertMergePDF();
        merge.init();
        ResultUrl = merge.ConcatFiles_JobID(fileurl, nDestFileType, size);

        return ResultUrl;
    }

    /**
     * 文件合并
     * @param fileurl
     * @param nDestFileType 文件类型， 0为PDF ，1为CEB，2为CEBX。
     * @param size
     * @return 返回文件路径
     */
    public String ConcatFiles_JobResult(String fileurl,int nDestFileType,int size){

        String ResultUrl = "";

        FileConvertMerge merge = new FileConvertMerge();
        merge.init();
        ResultUrl = merge.ConcatFiles_JobResult(fileurl, nDestFileType, size);

        return ResultUrl;
    }

    /*
     * 文本信息插入 （节点意见插入 含图片）
     */
    public String FillTextFields2(String fileurl,int size,String requestid,String workflowid,String formid,String nodeid,String requesturl){

        String ResultUrl = "";
        int nPageNum = 1;

        List list = getInsertTextNewServer(requestid, workflowid, formid, nodeid, requesturl);

        //衍 20150309 添加
        String yimgname = "";
        RecordSet rs = new RecordSet();
        rs.executeSql("select hwqp from formtable_main_"+(Util.getIntValue(formid,0)*-1)+" where requestid="+requestid);
        if(rs.next()){
            yimgname = Util.null2String(rs.getString("hwqp"));
            if(!yimgname.equals("")){
                yimgname += ",";
            }
        }
        //衍 20150309 添加

        String strAnchorName = "";
        String strCtrlValue = "";
        boolean bAppend = false;
        boolean bReadOnlyint = false;
        int nUserID = 15;
        String strUserName = "user";
        String strKey2ValueMap = "";

        FileConvertMerge merge = new FileConvertMerge();
        merge.init();

        for (int i = 0; i < list.size(); i++) {

            List clist = (List) list.get(i);

            if(clist.size()>2){
                strAnchorName = (String)clist.get(0);
                strCtrlValue = (String)clist.get(1);
                strKey2ValueMap = (String)clist.get(2);

                if(strAnchorName.length()>1){
                    strAnchorName = strAnchorName.substring(1);
                }

                if(strCtrlValue.length()>1){
                    strCtrlValue = strCtrlValue.substring(1);
                }

                if(strKey2ValueMap.length()>1){
                    strKey2ValueMap = strKey2ValueMap.substring(1);
                }
            }
            if(!strAnchorName.equals("")){

                //衍 20150309 添加
                if(yimgname.indexOf(","+strAnchorName+",")>-1){
                    continue;
                }

                writeLog("fileurl:"+fileurl);
                ResultUrl = merge.FillTextField(fileurl, nPageNum, strAnchorName, strCtrlValue, bAppend, bReadOnlyint, nUserID, strUserName, strKey2ValueMap, size);


                if(ResultUrl.length()>0){
                    int indxx = ResultUrl.lastIndexOf("/");
                    fileurl = strDestFolder + ResultUrl.substring(indxx+1);
                }
            }

            String TempResultUrl = ResultUrl;
            //20150210 衍 添加
            if(i==list.size()-1){

                String dowstrname = (String) clist.get(3);
                String dowstr = (String) clist.get(4);

                String imgnamestr = "";

                if(!dowstrname.equals("") && !dowstr.equals("") && dowstrname!=null && dowstr!=null){

                    //String[] fileTrueName3s = Util.TokenizerString2(fileTrueName3,",");
                    String[] dowstrnames = dowstrname.split("\\|");
                    String[] dowstrs = dowstr.split("\\|");
                    for (int j = 0; j < dowstrs.length; j++) {
                        strAnchorName = dowstrnames[j];

                        //衍 20150309 添加
                        if(yimgname.indexOf(","+strAnchorName+",")>-1){
                            continue;
                        }

                        imgnamestr += "," + strAnchorName;////衍 20150309 添加

                        ResultUrl = merge.AddImgToTextField(fileurl, nPageNum, strAnchorName, dowstrs[j], size);

                        if(ResultUrl.length()>0){
                            int indxx = ResultUrl.lastIndexOf("/");
                            fileurl = strDestFolder + ResultUrl.substring(indxx+1);
                        }
                    }

                    //衍 20150309 添加
                    if(!imgnamestr.equals("")){
                        rs.executeSql("update formtable_main_"+(Util.getIntValue(formid,0)*-1)+" set hwqp='"+imgnamestr+"' where requestid="+requestid);
                    }
                    //衍 20150309 添加
                }

            }

            if(ResultUrl.equals("")||ResultUrl.equals("0")){
                ResultUrl = TempResultUrl;
            }


        }


        return ResultUrl;



    }

    /**
     * 文本插入  节点信息  无图片
     * @return
     */
    public String FillTextFields(String fileurl,int size,String requestid,String workflowid,String formid,String nodeid,String requesturl){

        String ResultUrl = "";
        int nPageNum = 1;

        List list = getInsertTextNewServer(requestid, workflowid, formid, nodeid, requesturl);


        String strAnchorName = "";
        String strCtrlValue = "";
        boolean bAppend = false;
        boolean bReadOnlyint = false;
        int nUserID = 15;
        String strUserName = "user";
        String strKey2ValueMap = "";

        FileConvertMerge merge = new FileConvertMerge();
        merge.init();

        for (int i = 0; i < list.size(); i++) {

            List clist = (List) list.get(i);

            if(clist.size()>2){
                strAnchorName = (String)clist.get(0);
                strCtrlValue = (String)clist.get(1);
                strKey2ValueMap = (String)clist.get(2);

                if(strAnchorName.length()>1){
                    strAnchorName = strAnchorName.substring(1);
                }

                if(strCtrlValue.length()>1){
                    strCtrlValue = strCtrlValue.substring(1);
                }

                if(strKey2ValueMap.length()>1){
                    strKey2ValueMap = strKey2ValueMap.substring(1);
                }
            }
            if(!strAnchorName.equals("")){

                ResultUrl = merge.FillTextField(fileurl, nPageNum, strAnchorName, strCtrlValue, bAppend, bReadOnlyint, nUserID, strUserName, strKey2ValueMap, size);

                if(ResultUrl.length()>0){
                    int indxx = ResultUrl.lastIndexOf("/");
                    fileurl = strDestFolder + ResultUrl.substring(indxx+1);
                }
            }
            //20150210 衍 添加
            if(i==list.size()-1){

//				String dowstrname = (String) clist.get(3);
//				String dowstr = (String) clist.get(4);
//
//				if(!dowstrname.equals("") && !dowstr.equals("") && dowstrname!=null && dowstr!=null){
//
//					//String[] fileTrueName3s = Util.TokenizerString2(fileTrueName3,",");
//					String[] dowstrnames = dowstrname.split("\\|");
//					String[] dowstrs = dowstr.split("\\|");
//					for (int j = 0; j < dowstrs.length; j++) {
//						strAnchorName = dowstrnames[j];
//
//						ResultUrl = merge.AddImgToTextField(fileurl, nPageNum, strAnchorName, dowstrs[j], size);
//
//						if(ResultUrl.length()>0){
//							int indxx = ResultUrl.lastIndexOf("/");
//							fileurl = "D:\\CEBXConvertor\\apache-tomcat-6.0.32\\webapps\\Convertor\\ConvertData\\OAdest\\"+ResultUrl.substring(indxx+1);
//						}
//					}
//
//
//				}

            }


        }


        return ResultUrl;

    }

    /**
     * 插入类型
     * @param value
     * @return
     */
    public String InsertType(String value){
        String name = "";
        if("1".equals(value)){
            name = "节点意见";
        }else{
            name = "表单字段";
        }

        return name;
    }

    /**
     * 获取某个流程某个节点需要插入的信息内容。
     * @param requestid
     * @param workflowid
     * @param formid
     * @param nodeid
     * @return
     */
    public List getInsertText(String requestid,String workflowid,String formid,String nodeid){

        ResourceComInfo resourceComInfo =null;
        DepartmentComInfo departmentComInfo =null;
        SubCompanyComInfo subCompanyComInfo =null;
        try {
            resourceComInfo= new ResourceComInfo();
            departmentComInfo = new DepartmentComInfo();
            subCompanyComInfo = new SubCompanyComInfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RecordSet recordSet=new RecordSet();
        List list = new ArrayList();
        Map filevalue = this.getFieldValues(requestid, workflowid, formid, nodeid); //返回 所有表单字段的值集合

        String insertstr = ""; //插入文本信息
        String dowstr = "";  //下载信息

        String sql = "select * from workflow_Askdetail where workflowid="+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        while(recordSet.next()){
            int atype = recordSet.getInt("atype"); //插入类型  0 表单字段  1节点意见
            String fname = Util.null2String(recordSet.getString("fname")); //字段名称
            String tname = Util.null2String(recordSet.getString("tname")); //模板名称
            int htmltype = recordSet.getInt("htmltype");//字段类型
            int ftype = recordSet.getInt("ftype");  //浏览按钮类型
            int lnum = recordSet.getInt("lnum");	//意见数
            int pagenum = recordSet.getInt("page"); //模板页
            int opnodeid = recordSet.getInt("opnodeid"); //意见节点id
            int ifzb = recordSet.getInt("ifzb"); //意见节点是否转办
            int fieldid = Util.getIntValue(bfUtil.getlabelId(fname, Util.getIntValue(formid, 0), "0", "0"),0); //字段id

            //writeLog("workflow_Askdetail: atype:"+atype +"  fname:"+fname+"  tname:"+tname+"  htmltype:"+htmltype);
            //writeLog("workflow_Askdetail: lnum:"+lnum +"  pagenum:"+pagenum+"  opnodeid:"+opnodeid+"  ftype:"+ftype);

            if(atype==0){ //0 表单字段

                String value = "";
                if(htmltype==1){ //文本

                    value = filevalue.get(fname).toString();
                    value = this.delHTMLTag(value); //去掉html标签
                    value = Util.replaceHtml(value); //去掉html标签
                    insertstr = insertstr + "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+value+"',false,false);";
                }else if(htmltype==2){//下拉选择框

                    String fileid = bfUtil.getlabelId(fname,Util.getIntValue(formid, 0),"0","1");  //字段id
                    String fileval = bfUtil.getselectName(filevalue.get(fname).toString(),fileid); //字段显示值
                    value = fileval;

                    insertstr = insertstr + "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+fileval+"',false,false);";
                }else if(htmltype==3){//浏览按钮

                    value = filevalue.get(fname).toString();
                    if(ftype==1){//人力资源

                        value = resourceComInfo.getMulResourcename(value); //人员名称  多
                    }else if(ftype==2){//部门

                        value = departmentComInfo.getDepartmentname(value); //部门名称 单
                    }else if(ftype==3){ //单位

                        value = subCompanyComInfo.getSubcompanynames(value); //单位名称  多
                    }else{ //日期
                        value = filevalue.get(fname).toString();
                    }

                    insertstr = insertstr + "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+value+"',false,false);";
                }else if(htmltype==4){//流程标题(系统默认)

                    value = this.getRequestname(requestid, "requestname");//流程标题
                    insertstr = insertstr + "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+value+"',false,false);";
                }else if(htmltype==5){//紧急程度(系统默认)

                    value = this.getRequestname(requestid, "requestlevel");
                    if("0".equals(value)){
                        value = "正常";
                    }else if("1".equals(value)){
                        value = "重要";
                    }else if("2".equals(value)){
                        value = "紧急";
                    }
                    insertstr = insertstr + "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+value+"',false,false);";
                }

            }else if(atype==1){ //1节点意见

                if(lnum==1 && ifzb==0){ //意见数1

                    String fileval = this.getrequestLog(requestid+"",opnodeid+"");

                    Map imgMap = this.getRequestLogImg(requestid+"",opnodeid+"");
                    if(imgMap==null){
                        if(fileval!=null && !"".equals(fileval)){
                            insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+fileval+"',false,false);";
                        }
                    }else{

                        String hzname3 = imgMap.get("hzname").toString();
                        String fileHname3 = imgMap.get("fileHname").toString();
                        String fileTrueName3 = imgMap.get("fileTrueName").toString();

                        String[] hzname3s = Util.TokenizerString2(hzname3,","); //拆分多字段名称
                        String[] fileHname3s = Util.TokenizerString2(fileHname3,","); //拆分多字段名称
                        String[] fileTrueName3s = Util.TokenizerString2(fileTrueName3,","); //拆分多字段名称
                        //获得文档ids
                        if (fileHname3s.length>0) {

                            dowstr += "Test_HTTPDownloadFile(LocalPath+'"+fileHname3s[0]+"."+hzname3s[0]+"',requesturl+'/"+fileTrueName3s[0]+"');";
                            insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"',LocalPath+'"+fileHname3s[0]+"."+hzname3s[0]+"');";
                        }
                    }
                }else if(lnum>1 || ifzb==1){ //意见数大于1
                    int logtype = 0;

                    if(ifzb==1){
                        logtype = 9;
                    }

                    writeLog(requestid+" : "+opnodeid+" : "+logtype+" : "+fieldid);

                    Map imgMap = this.getrequestLogMap(requestid+"",opnodeid+"",logtype,fieldid);

                    List listimg = this.getrequestLogList(requestid+"",opnodeid+"",logtype,fieldid);
                    int imgcou = 0;
                    for(int limg = 0;limg<listimg.size();limg++){

                        if(limg>=lnum){
                            break;
                        }

                        String key = listimg.get(limg).toString(); //字段名

                        writeLog("uukey:"+key);

                        if(key.indexOf("img")>0){
                            Map usrmap = (Map) imgMap.get(key);
                            String hzname3 = usrmap.get("hzname").toString();
                            String fileHname3 = usrmap.get("fileHname").toString();
                            String fileTrueName3 = usrmap.get("fileTrueName").toString();
                            String bz = usrmap.get("bz").toString();

                            dowstr += "Test_HTTPDownloadFile(LocalPath+'"+fileHname3+"."+hzname3+"',requesturl+'/"+fileTrueName3+"');";
                            if(lnum==1){
                                insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"',LocalPath+'"+fileHname3+"."+hzname3+"');";
                            }else{

                                insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"',LocalPath+'"+fileHname3+"."+hzname3+"');";
                                if(workflowid.equals("103") && tname.equals("psyj")){
                                    insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"bz','"+bz+"',false,false);";
                                }
                            }

                        }else{
                            String keyValue = Util.null2String((String)imgMap.get(key)); //值
                            if(keyValue!=null && !"".equals(keyValue)){
                                if(lnum==1){
                                    insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+keyValue+"',false,false);";
                                }else{
                                    insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"','"+keyValue+"',false,false);";
                                }
                            }
                        }

                    }
                }

            }

        }

        list.add(insertstr);
        list.add(dowstr);

        return list;
    }

    /**
     * 根据logid 获取文件id
     * @param logid
     * @return
     */
    public String getRequestLog(String logid){

        String remark = "";

        RecordSet rs1=new RecordSet();

        String sql = "select * from workflow_requestlog where logid = "+Util.getIntValue(logid, 0);
        RecordSet recordSet=new RecordSet();
        recordSet.executeSql(sql);
        if(recordSet.next()){
            String logtype=Util.null2String(recordSet.getString("logtype"));
            int requestLogId=Util.getIntValue(recordSet.getString("requestLogId"),0);

            if(requestLogId>0){
                int imageFileId=-1;
                rs1.executeSql(" select imageFileId from Workflow_FormSignRemark where requestLogId="+requestLogId);
                if(rs1.next()){
                    imageFileId=Util.getIntValue(rs1.getString("imageFileId"),-1);
                }

                if(imageFileId>-1){
                    remark="<img src=\"/weaver/weaver.file.FileDownload?fileid="+imageFileId + "\" ></img>";
                }
            }else{

                remark=Util.null2String(recordSet.getString("remark"));
                if(remark!=null && !"".equals(remark)){
                    String remark_tmp = remark;
                    try{
                        if(remark.indexOf("initFlashVideo")>-1 && remark.indexOf("</p>")>-1){
                            int index_1 = remark.lastIndexOf("</p>");
                            remark = remark.substring(0, index_1) + remark.substring(index_1+4);
                        }
                    }catch(Exception e){
                        remark = remark_tmp;
                    }
                }

                remark = Util.replaceHtml(remark);

                remark = this.delHTMLTag(remark);
            }

        }



        return remark;
    }

    /**
     * 获取某个流程某个节点需要插入的字段的值
     * @param requestid
     * @param workflowid
     * @param formid
     * @param nodeid
     * @return
     */
    public Map getFieldValues(String requestid,String workflowid,String formid,String nodeid){

        RecordSet recordSet=new RecordSet();

        Map scheduleMap=new HashMap(); //返回Map

        List fieldnames = new ArrayList(); //表单字段名集合

        String sql = "select id,fname from workflow_Askdetail where workflowid="+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0)+" and atype=0";
        recordSet.executeSql(sql);
        while(recordSet.next()){
            fieldnames.add(recordSet.getString("fname"));
        }

        scheduleMap = this.getFieldValue(requestid, fieldnames, formid);

        return scheduleMap;
    }

    /**
     * 获取请求标题、紧急程度
     * @param requestid
     * @param name  字段名
     * @return
     */
    public String getRequestname(String requestid,String name){
        RecordSet recordSet=new RecordSet();

        String requestname = "";
        recordSet.executeSql("select "+name+" from workflow_requestbase where requestid="+Util.getIntValue(requestid, 0));
        if(recordSet.next()){
            requestname = recordSet.getString(name);
        }

        return requestname;

    }

    /**
     * 是否有转发收回
     * @return
     */
    public boolean IsRemarkRun(String requestid,String nodeid,String userid){
        boolean flag = false;

        RecordSet recordSet=new RecordSet();
        int cou = 0;
        recordSet.executeSql("select count(*) cou from workflow_currentoperator where requestid="+Util.getIntValue(requestid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0)+" and isremark=1");
        if(recordSet.next()){
            cou = recordSet.getInt("cou");
        }
        if(cou>0){
            flag = true;
        }
        return flag;
    }


    /**
     * 某个流程某个节点需要插入的信息内容。
     * @param requestid
     * @param workflowid
     * @param formid
     * @param nodeid
     * @return
     */
    public String getInsertTextNew(String requestid,String workflowid,String formid,String nodeid,String requesturl){

        ResourceComInfo resourceComInfo =null;
        DepartmentComInfo departmentComInfo =null;
        SubCompanyComInfo subCompanyComInfo =null;
        try {
            resourceComInfo= new ResourceComInfo();
            departmentComInfo = new DepartmentComInfo();
            subCompanyComInfo = new SubCompanyComInfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RecordSet recordSet=new RecordSet();
        List list = new ArrayList();
        Map filevalue = this.getFieldValues(requestid, workflowid, formid, nodeid); //返回 所有表单字段的值集合

        String insertstr = ""; //插入文本信息
        String namestr = ""; //插入name
        String dowstr = "";  //下载信息

        String sql = "select * from workflow_Askdetail where workflowid="+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        recordSet.executeSql(sql);
        while(recordSet.next()){
            int atype = recordSet.getInt("atype"); //插入类型  0 表单字段  1节点意见
            String fname = Util.null2String(recordSet.getString("fname")); //字段名称
            String tname = Util.null2String(recordSet.getString("tname")); //模板名称
            int htmltype = recordSet.getInt("htmltype");//字段类型
            int ftype = recordSet.getInt("ftype");  //浏览按钮类型
            int lnum = recordSet.getInt("lnum");	//意见数
            int pagenum = recordSet.getInt("page"); //模板页
            int opnodeid = recordSet.getInt("opnodeid"); //意见节点id
            int ifzb = recordSet.getInt("ifzb"); //意见节点是否转办
            int fieldid = Util.getIntValue(bfUtil.getlabelId(fname, Util.getIntValue(formid, 0), "0", "0"),0); //字段id

            //writeLog("workflow_Askdetail: atype:"+atype +"  fname:"+fname+"  tname:"+tname+"  htmltype:"+htmltype);
            //writeLog("workflow_Askdetail: lnum:"+lnum +"  pagenum:"+pagenum+"  opnodeid:"+opnodeid+"  ftype:"+ftype);

            if(atype==0){ //0 表单字段

                String value = "";
                if(htmltype==1){ //文本

                    value = filevalue.get(fname).toString();
                    value = this.delHTMLTag(value); //去掉html标签
                    value = Util.replaceHtml(value); //去掉html标签

                }else if(htmltype==2){//下拉选择框

                    String fileid = bfUtil.getlabelId(fname,Util.getIntValue(formid, 0),"0","1");  //字段id
                    String fileval = bfUtil.getselectName(filevalue.get(fname).toString(),fileid); //字段显示值

                    value = fileval;

                }else if(htmltype==3){//浏览按钮

                    value = filevalue.get(fname).toString();
                    if(ftype==1){//人力资源

                        value = resourceComInfo.getMulResourcename(value); //人员名称  多
                    }else if(ftype==2){//部门

                        value = departmentComInfo.getDepartmentname(value); //部门名称 单
                    }else if(ftype==3){ //单位

                        value = subCompanyComInfo.getSubcompanynames(value); //单位名称  多
                    }else{ //日期
                        value = filevalue.get(fname).toString();
                    }

                }else if(htmltype==4){//流程标题(系统默认)

                    value = this.getRequestname(requestid, "requestname");//流程标题

                }else if(htmltype==5){//紧急程度(系统默认)

                    value = this.getRequestname(requestid, "requestlevel");
                    if("0".equals(value)){
                        value = "正常";
                    }else if("1".equals(value)){
                        value = "重要";
                    }else if("2".equals(value)){
                        value = "紧急";
                    }

                }
                if(value!=null && !"".equals(value)){
                    namestr = namestr + "|" + tname;  //名称
                    insertstr = insertstr + "|" + value;  //值
                }

            }else if(atype==1){ //1节点意见

                if(lnum==1 && ifzb==0){ //意见数1

                    String fileval = this.getrequestLog(requestid+"",opnodeid+"");

                    Map imgMap = this.getRequestLogImg(requestid+"",opnodeid+"");
                    if(imgMap==null){
                        if(fileval!=null && !"".equals(fileval)){

                            namestr = namestr + "|" + tname;  //名称
                            insertstr = insertstr + "|" + fileval;  //值
                            //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+fileval+"',false,false);";
                        }
                    }else{

                        String hzname3 = imgMap.get("hzname").toString();
                        String fileHname3 = imgMap.get("fileHname").toString();
                        String fileTrueName3 = imgMap.get("fileTrueName").toString();

                        String[] hzname3s = Util.TokenizerString2(hzname3,","); //拆分多字段名称
                        String[] fileHname3s = Util.TokenizerString2(fileHname3,","); //拆分多字段名称
                        String[] fileTrueName3s = Util.TokenizerString2(fileTrueName3,","); //拆分多字段名称
                        //获得文档ids
                        if (fileHname3s.length>0) {

                            //dowstr += "Test_HTTPDownloadFile(LocalPath+'"+fileHname3s[0]+"."+hzname3s[0]+"',requesturl+'/"+fileTrueName3s[0]+"');";
                            //insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"',LocalPath+'"+fileHname3s[0]+"."+hzname3s[0]+"');";

                            dowstr = dowstr + "|" + requesturl+"/"+fileTrueName3s[0];
                        }
                    }
                }else if(lnum>1 || ifzb==1){ //意见数大于1
                    int logtype = 0;

                    if(ifzb==1){
                        logtype = 9;
                    }

                    //writeLog(requestid+" : "+opnodeid+" : "+logtype+" : "+fieldid);

                    Map imgMap = this.getrequestLogMap(requestid+"",opnodeid+"",logtype,fieldid);

                    List listimg = this.getrequestLogList(requestid+"",opnodeid+"",logtype,fieldid);
                    int imgcou = 0;
                    for(int limg = 0;limg<listimg.size();limg++){

                        if(limg>=lnum){
                            break;
                        }

                        String key = listimg.get(limg).toString(); //字段名

                        //writeLog("uukey:"+key);

                        if(key.indexOf("img")>0){
                            Map usrmap = (Map) imgMap.get(key);
                            String hzname3 = usrmap.get("hzname").toString();
                            String fileHname3 = usrmap.get("fileHname").toString();
                            String fileTrueName3 = usrmap.get("fileTrueName").toString();
                            String bz = usrmap.get("bz").toString();

                            //dowstr += "Test_HTTPDownloadFile(LocalPath+'"+fileHname3+"."+hzname3+"',requesturl+'/"+fileTrueName3+"');";
                            dowstr = dowstr + "|" + requesturl+"/"+fileTrueName3;

                            if(lnum==1){
                                insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"',LocalPath+'"+fileHname3+"."+hzname3+"');";
                            }else{

                                insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"',LocalPath+'"+fileHname3+"."+hzname3+"');";
                                if(workflowid.equals("103") && tname.equals("psyj")){

                                    namestr = namestr + "|" + tname+(limg+1)+"bz";  //名称
                                    insertstr = insertstr + "|" + bz;  //值
                                    //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"bz','"+bz+"',false,false);";
                                }
                            }

                        }else{
                            String keyValue = Util.null2String((String)imgMap.get(key)); //值
                            if(keyValue!=null && !"".equals(keyValue)){
                                if(lnum==1){

                                    namestr = namestr + "|" + tname;  //名称
                                    insertstr = insertstr + "|" + keyValue;  //值

                                    //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+keyValue+"',false,false);";
                                }else{

                                    namestr = namestr + "|" + tname+(limg+1);  //名称
                                    insertstr = insertstr + "|" + keyValue;  //值

                                    //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"','"+keyValue+"',false,false);";
                                }
                            }
                        }

                    }
                }

            }

        }

        list.add(insertstr);
        list.add(dowstr);

        return "";
    }

    /**
     * 某个流程某个节点需要插入的信息内容。
     * @param requestid
     * @param workflowid
     * @param formid
     * @param nodeid
     * @return
     */
    public List getInsertTextNewServer(String requestid,String workflowid,String formid,String nodeid,String requesturl){

        ResourceComInfo resourceComInfo =null;
        DepartmentComInfo departmentComInfo =null;
        SubCompanyComInfo subCompanyComInfo =null;
        try {
            resourceComInfo= new ResourceComInfo();
            departmentComInfo = new DepartmentComInfo();
            subCompanyComInfo = new SubCompanyComInfo();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List zlist = new ArrayList();
        RecordSet recordSet=new RecordSet();
        List list = new ArrayList();
        Map filevalue = this.getFieldValues(requestid, workflowid, formid, nodeid); //返回 所有表单字段的值集合

        boolean Cflag = IfInitialize(workflowid+"",nodeid+""); //是否初始化

        String insertstr = ""; //插入文本信息
        String namestr = ""; //插入name
        String valuestr = ""; //插入值
        String dowstr = "";  //下载(图片地址)信息
        String dowstrname = "";  //插入 name 下载(图片)信息

        String Tempvaluestr = "";
        int Tempint = 0;

        String sql = "select * from workflow_Askdetail where workflowid="+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        if(!Cflag){
            sql = "select * from workflow_Askdetail where atype=1 and workflowid="+Util.getIntValue(workflowid, 0)+" and nodeid="+Util.getIntValue(nodeid, 0);
        }
        recordSet.executeSql(sql);
        while(recordSet.next()){
            int atype = recordSet.getInt("atype"); //插入类型  0 表单字段  1节点意见
            String fname = Util.null2String(recordSet.getString("fname")); //字段名称
            String tname = Util.null2String(recordSet.getString("tname")); //模板名称
            int htmltype = recordSet.getInt("htmltype");//字段类型
            int ftype = recordSet.getInt("ftype");  //浏览按钮类型
            int lnum = recordSet.getInt("lnum");	//意见数
            int pagenum = recordSet.getInt("page"); //模板页
            int opnodeid = recordSet.getInt("opnodeid"); //意见节点id
            int ifzb = recordSet.getInt("ifzb"); //意见节点是否转办
            int fieldid = Util.getIntValue(bfUtil.getlabelId(fname, Util.getIntValue(formid, 0), "0", "0"),0); //字段id

            //writeLog("workflow_Askdetail: atype:"+atype +"  fname:"+fname+"  tname:"+tname+"  htmltype:"+htmltype);
            //writeLog("workflow_Askdetail: lnum:"+lnum +"  pagenum:"+pagenum+"  opnodeid:"+opnodeid+"  ftype:"+ftype);


            if(atype==0){ //0 表单字段

                String value = "";
                if(htmltype==1){ //文本

                    value = filevalue.get(fname).toString();
                    value = this.delHTMLTag(value); //去掉html标签
                    value = Util.replaceHtml(value); //去掉html标签

                }else if(htmltype==2){//下拉选择框

                    String fileid = bfUtil.getlabelId(fname,Util.getIntValue(formid, 0),"0","1");  //字段id
                    String fileval = bfUtil.getselectName(filevalue.get(fname).toString(),fileid); //字段显示值
                    value = fileval;

                }else if(htmltype==3){//浏览按钮

                    value = filevalue.get(fname).toString();
                    if(ftype==1){//人力资源

                        value = resourceComInfo.getMulResourcename(value); //人员名称  多
                    }else if(ftype==2){//部门

                        value = departmentComInfo.getDepartmentname(value); //部门名称 单
                    }else if(ftype==3){ //单位

                        value = subCompanyComInfo.getSubcompanynames(value); //单位名称  多
                    }else{ //日期
                        value = filevalue.get(fname).toString();
                    }

                }else if(htmltype==4){//流程标题(系统默认)

                    value = this.getRequestname(requestid, "requestname");//流程标题

                }else if(htmltype==5){//紧急程度(系统默认)

                    value = this.getRequestname(requestid, "requestlevel");
                    if("0".equals(value)){
                        value = "正常";
                    }else if("1".equals(value)){
                        value = "重要";
                    }else if("2".equals(value)){
                        value = "紧急";
                    }

                }
                if(value!=null && !"".equals(value)){

                    Tempvaluestr = insertstr + ":" + tname +":" + value;
                    if(Strlength(Tempvaluestr)>128){ //截取

                        list = new ArrayList();
                        list.add(namestr);
                        list.add(valuestr);
                        list.add(insertstr);
                        list.add(dowstrname);
                        list.add(dowstr);

                        writeLog("namestr:"+namestr);
                        writeLog("valuestr:"+valuestr);
                        writeLog("insertstr:"+insertstr);
                        //writeLog("dowstrname:"+dowstrname);
                        //writeLog("dowstr:"+dowstr);

                        zlist.add(list);
                        insertstr = ""; //插入文本信息
                        namestr = ""; //插入name
                        valuestr = ""; //插入值

                    }

                    namestr = namestr + "|" + tname;  //名称
                    insertstr = insertstr + ":" + tname +":" + value;  //值
                    valuestr = valuestr + "|" + value;  //值

                }

            }else if(atype==1){ //1节点意见

                if(lnum==1 && ifzb==0){ //意见数1

                    String fileval = this.getrequestLog(requestid+"",opnodeid+"");

                    Map imgMap = this.getRequestLogImg(requestid+"",opnodeid+"");
                    if(imgMap==null){
                        if(fileval!=null && !"".equals(fileval)){


                            //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+fileval+"',false,false);";

                            Tempvaluestr = insertstr + ":" + tname +":" + fileval;
                            if(Strlength(Tempvaluestr)>128){ //截取

                                list = new ArrayList();
                                list.add(namestr);
                                list.add(valuestr);
                                list.add(insertstr);
                                list.add(dowstrname);
                                list.add(dowstr);

                                writeLog("namestr:"+namestr);
                                writeLog("valuestr:"+valuestr);
                                writeLog("insertstr:"+insertstr);
                                //writeLog("dowstrname:"+dowstrname);
                                //writeLog("dowstr:"+dowstr);

                                zlist.add(list);
                                insertstr = ""; //插入文本信息
                                namestr = ""; //插入name
                                valuestr = ""; //插入值
                            }

                            namestr = namestr + "|" + tname;  //名称
                            insertstr = insertstr + ":"+ tname +":"+ fileval;  //值
                            valuestr = valuestr + "|" + fileval;  //值

                        }
                    }else{

                        String hzname3 = imgMap.get("hzname").toString();
                        String fileHname3 = imgMap.get("fileHname").toString();
                        String fileTrueName3 = imgMap.get("fileTrueName").toString();

                        String[] hzname3s = Util.TokenizerString2(hzname3,","); //拆分多字段名称
                        String[] fileHname3s = Util.TokenizerString2(fileHname3,","); //拆分多字段名称
                        String[] fileTrueName3s = Util.TokenizerString2(fileTrueName3,","); //拆分多字段名称
                        //获得文档ids
                        if (fileHname3s.length>0) {

                            //dowstr += "Test_HTTPDownloadFile(LocalPath+'"+fileHname3s[0]+"."+hzname3s[0]+"',requesturl+'/"+fileTrueName3s[0]+"');";
                            //insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"',LocalPath+'"+fileHname3s[0]+"."+hzname3s[0]+"');";

                            dowstr = dowstr + "|" + requesturl+"/"+fileTrueName3s[0];
                            dowstrname = dowstrname + "|" + tname;
                        }
                    }
                }else if(lnum>1 || ifzb==1){ //意见数大于1
                    int logtype = 0;

                    if(ifzb==1){
                        logtype = 9;
                    }

                    //writeLog(requestid+" : "+opnodeid+" : "+logtype+" : "+fieldid);

                    Map imgMap = this.getrequestLogMap(requestid+"",opnodeid+"",logtype,fieldid);

                    List listimg = this.getrequestLogList(requestid+"",opnodeid+"",logtype,fieldid);
                    int imgcou = 0;
                    for(int limg = 0;limg<listimg.size();limg++){

                        if(limg>=lnum){
                            break;
                        }

                        String key = listimg.get(limg).toString(); //字段名

                        //writeLog("uukey:"+key);

                        if(key.indexOf("img")>0){
                            Map usrmap = (Map) imgMap.get(key);
                            String hzname3 = usrmap.get("hzname").toString();
                            String fileHname3 = usrmap.get("fileHname").toString();
                            String fileTrueName3 = usrmap.get("fileTrueName").toString();
                            String bz = usrmap.get("bz").toString();

                            //dowstr += "Test_HTTPDownloadFile(LocalPath+'"+fileHname3+"."+hzname3+"',requesturl+'/"+fileTrueName3+"');";
                            dowstr = dowstr + "|" + requesturl+"/"+fileTrueName3;


                            if(lnum==1){
                                dowstrname = dowstrname + "|" + tname;
                                //insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"',LocalPath+'"+fileHname3+"."+hzname3+"');";
                            }else{
                                dowstrname = dowstrname + "|" + tname+(limg+1);
                                //insertstr += "Click_AddImgStamp(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"',LocalPath+'"+fileHname3+"."+hzname3+"');";
                                if(workflowid.equals("103") && tname.equals("psyj")){

                                    //namestr = namestr + "|" + tname+(limg+1)+"bz";  //名称
                                    //insertstr = insertstr + "|" + bz;  //值
                                    //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"bz','"+bz+"',false,false);";

                                    namestr = namestr + "|" + tname+(limg+1)+"bz";  //名称
                                    insertstr = insertstr + ":"+tname+(limg+1)+"bz"+":" + bz;  //值
                                    valuestr = valuestr + "|" + bz;
                                }
                            }

                        }else{
                            String keyValue = Util.null2String((String)imgMap.get(key)); //值
                            if(keyValue!=null && !"".equals(keyValue)){
                                if(lnum==1){

                                    //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+"','"+keyValue+"',false,false);";

                                    Tempvaluestr = insertstr + ":"+tname+":" + keyValue;  //值
                                    if(Strlength(Tempvaluestr)>128){ //截取

                                        list = new ArrayList();
                                        list.add(namestr);
                                        list.add(valuestr);
                                        list.add(insertstr);
                                        list.add(dowstrname);
                                        list.add(dowstr);

                                        writeLog("namestr:"+namestr);
                                        writeLog("valuestr:"+valuestr);
                                        writeLog("insertstr:"+insertstr);
                                        //writeLog("dowstrname:"+dowstrname);
                                        //writeLog("dowstr:"+dowstr);

                                        zlist.add(list);
                                        insertstr = ""; //插入文本信息
                                        namestr = ""; //插入name
                                        valuestr = ""; //插入值
                                    }
                                    namestr = namestr + "|" + tname;  //名称
                                    insertstr = insertstr + ":"+tname+":" + keyValue;  //值
                                    valuestr = valuestr + "|" + keyValue;

                                }else{

                                    Tempvaluestr = insertstr + ":"+tname+(limg+1)+":" + keyValue;  //值
                                    if(Strlength(Tempvaluestr)>128){ //截取

                                        list = new ArrayList();
                                        list.add(namestr);
                                        list.add(valuestr);
                                        list.add(insertstr);
                                        list.add(dowstrname);
                                        list.add(dowstr);

                                        writeLog("namestr:"+namestr);
                                        writeLog("valuestr:"+valuestr);
                                        writeLog("insertstr:"+insertstr);
                                        //writeLog("dowstrname:"+dowstrname);
                                        //writeLog("dowstr:"+dowstr);

                                        zlist.add(list);
                                        insertstr = ""; //插入文本信息
                                        namestr = ""; //插入name
                                        valuestr = ""; //插入值
                                    }

                                    namestr = namestr + "|" + tname+(limg+1);  //名称
                                    insertstr = insertstr + ":"+tname+(limg+1)+":" + keyValue;  //值
                                    valuestr = valuestr + "|" + keyValue;
                                    //insertstr += "Click_InsertTexthb(LocalPath+FileHName+'.cebx',"+pagenum+",'"+tname+(limg+1)+"','"+keyValue+"',false,false);";

                                }
                            }
                        }

                    }
                }

            }

        }

        if(recordSet.getColCounts()>0){

            list = new ArrayList();
            list.add(namestr);
            list.add(valuestr);
            list.add(insertstr);
            list.add(dowstrname);
            list.add(dowstr);

            writeLog("namestr:"+namestr);
            writeLog("valuestr:"+valuestr);
            writeLog("insertstr:"+insertstr);
            writeLog("dowstrname:"+dowstrname);
            writeLog("dowstr:"+dowstr);

            zlist.add(list);
        }


        return zlist;
    }

    /**
     * 任务结果处理  创建附件到流程中
     * @param cebxurl
     * @param requestid
     * @param wsid
     * @param qfieldname
     * @param formid
     * @param userid
     */
    public void CEBXJobResultMerge(String cebxurl,int requestid,int wsid,String qfieldname,int formid,int userid){


        String fileurl = this.strDestFolder+cebxurl;

        //WorkflowFileCMInfo cmInfo = new WorkflowFileCMInfo(wsid);

        //fileUtil.createFile(cebxurl, requestid, wsid, qfieldname, formid, userid);

        boolean flag = false;
        WorkflowFilePDF wkFile = new WorkflowFilePDF();

        int indxx = cebxurl.lastIndexOf("/");
        cebxurl = cebxurl.substring(indxx+1);

        String filename=cebxurl;  //文件名称
        String filenamepath="/app/ecology/hbcebx/"; //文件存放目录

        RecordSet rs = new RecordSet();

        String maintable = RequestFileCMInfo.getTablename(formid);

        String filedname=""; //文件中文名称


        //查询流程标题
        rs.executeSql("select requestname,requestid from workflow_requestbase where requestid="+requestid);
        if(rs.next()){
            filedname = rs.getString("requestname");
        }


        try {

            writeLog("filename:"+filename);
            writeLog("filenamepath:"+filenamepath);
            FtpPDF ts = new FtpPDF();
            //FtpCEBX ts=new FtpCEBX(); //从合并服务器取回文件
//            ts.myget(filename,filenamepath);
            ts.downloadFtpFile("D:\\Tomcat-7-ConvertService\\webapps\\convert\\OAdest\\",filenamepath,filename);

            String hz = "";
            if(filename.indexOf(".")>0){
                hz = filename.substring(filename.indexOf(".")+1);
            }


            //文件名称
            if(!"".equals(filedname)){
                filename=filedname+"."+hz;
            }

            try {
                Thread.sleep(2000);//休眠 2秒
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            String workflowid = WorkflowUtil.getWorkflowid(requestid)+"";

            //wkFile.saveFileAll(cmInfo.getWorkflowid()+"",requestid+"",filename,filenamepath,userid+"","jsgx@2012",qfieldname);
            wkFile.saveFileAll(workflowid, requestid+"", filename, filenamepath + cebxurl, userid+"", "jsgx@2012", qfieldname, formid,true);
            //bb.writeLog("创建人"+creaid);

            String docid="0";
            String fwh="0";

            rs.executeSql("select "+qfieldname+" from "+maintable+" where requestid="+requestid);
            if(rs.next()){
                docid=rs.getString(""+qfieldname);
            }
            //更新目录
            //rs.executeSql("update docdetail set maincategory=370,subcategory=708,seccategory=1142 where id="+Util.getIntValue(docid,0));

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        WorkflowUtil wfUtil = new WorkflowUtil();
        wfUtil.nextNodeBySubmit(requestid, Util.getIntValue(wfUtil.getCurroperators(requestid),0), "");
    }

    /**
     * 任务结果处理  创建附件到流程中
     * @param cebxurl
     * @param requestid
     * @param wsid
     * @param qfieldname
     * @param formid
     * @param userid
     */
    public void JobResultMerge(String cebxurl,int requestid,int wsid,String qfieldname,int formid,int userid){


        String fileurl = this.strDestFolder+cebxurl;

        WorkflowFileCMInfo cmInfo = new WorkflowFileCMInfo(wsid);

        FillTextFields(fileurl,0,requestid+"",cmInfo.getWorkflowid()+"",formid+"",cmInfo.getNodeid()+"","");

        writeLog("19:cebxurl:"+cebxurl);
        if(cebxurl==null || "".equals(cebxurl)){

            writeLog("19错误:cebxurl:"+cebxurl);
        }
        CebFileUtil fileUtil = new CebFileUtil();

        fileUtil.createFile(cebxurl, requestid, wsid, qfieldname, formid, userid);
        int hbnodeid = cmInfo.getHbnodeid();//合并等待节点
        writeLog("合并等待节点["+hbnodeid+"]");
        if(hbnodeid>0){
            WorkflowUtil wfUtil = new WorkflowUtil();

            int dnodeid = wfUtil.getReqeustNode(requestid);//流程当前节点
            if(dnodeid==hbnodeid){
                writeLog("合并等待节点自动提交：["+dnodeid+"]");
                wfUtil.nextNodeBySubmit(requestid, Util.getIntValue(wfUtil.getCurroperators(requestid),0), "");
            }
        }

    }

    /**
     * 更新任务信息
     * @param requestid
     * @param jobid
     * @param wsid
     * @return
     */
    public static boolean UpdateCebjobresult(int requestid,int jobid,int wsid,String qfieldname,int formid,int userid){
        boolean flag = false;
        RecordSet rs = new RecordSet();

        String sql = "insert into cebjobresult(jobid,requestid,wsid,qfieldname,formid,userid,type) values("+jobid+","+requestid+","+wsid+",'"+qfieldname+"',"+formid+","+userid+",0)";
        flag = rs.executeSql(sql);

        return flag;
    }

    /**
     * 更新任务信息
     * @param requestid
     * @param jobid
     * @param wsid
     * @return
     */
    public static boolean UpdateCebjobresultSign(int requestid,int jobid,int wsid,String qfieldname,int formid,int userid){
        boolean flag = false;
        RecordSet rs = new RecordSet();

        String sql = "insert into cebjobresult(jobid,requestid,wsid,qfieldname,formid,userid,type) values("+jobid+","+requestid+","+wsid+",'"+qfieldname+"',"+formid+","+userid+",1)";
        flag = rs.executeSql(sql);

        rs.executeSql("update formtable_main_"+(formid*-1)+" set cebjobid = '"+jobid+"' where requestid="+requestid);

        return flag;
    }

    /**
     * 更新任务信息
     * @param requestid
     * @param jobid
     * @param wsid
     * @return
     */
    public static boolean UpdateCebxjobresultSign(int requestid,int jobid,int wsid,String qfieldname,int formid,int userid){
        boolean flag = false;
        RecordSet rs = new RecordSet();

        String sql = "insert into cebjobresult(jobid,requestid,wsid,qfieldname,formid,userid,type) values("+jobid+","+requestid+","+wsid+",'"+qfieldname+"',"+formid+","+userid+",2)";
        flag = rs.executeSql(sql);

        //rs.executeSql("update formtable_main_"+(formid*-1)+" set cebjobid = '"+jobid+"' where requestid="+requestid);

        return flag;
    }

    public static int Strlength(String s) {
        if (s == null)
            return 0;
        char[] c = s.toCharArray();
        int len = 0;
        for (int i = 0; i < c.length; i++) {
            len++;
            if (!isLetter(c[i])) {
                len++;
            }
        }
        return len;
    }

    public static boolean isLetter(char c) {
        int k = 0x80;
        return c / k == 0 ? true : false;
    }

    public static void main(String[] args) {


        String kk=":bb:人民币:htdwqc:江苏射阳港发电有限责任公司:khhyh:江苏省国信集团财务有限公司:lxfs:025-83078563:cwfzr: 李红霞:sblx:报批:ywht:有合同:zyzjsxnr:发放流动资金贷款:yhzh:20120101101208010033:htje:10000:tbrq:2014-10-31:jjcd:正常:tbgsmc:江苏省国信集团财务有限公司";

        int j = Strlength(kk);

        int uu = kk.length();

        System.out.println(j);

        System.out.println(uu);
    }

}