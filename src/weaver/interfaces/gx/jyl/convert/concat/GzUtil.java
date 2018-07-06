package weaver.interfaces.gx.jyl.convert.concat;

import org.apache.commons.io.FileUtils;
import weaver.conn.RecordSet;
import weaver.docs.proce.CebFileUtil;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.company.SubCompanyComInfo;
import weaver.hrm.resource.ResourceComInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GzUtil extends BaseBean {

    private CebFileUtil fileUtil = new CebFileUtil();

    /**
     * 复制文件
     *
     * @param orgpath  原目录d:\\a\\a.doc
     * @param destpath 目标目录d:\\a\\b.doc
     */
    public void copyFile(String orgpath, String destpath) {
        try {
            writeLog("原文件目录:"+orgpath);
            writeLog("目标目录:"+destpath);
            File file = new File(orgpath);
            InputStream inputStream = new FileInputStream(file);
            FileUtils.copyInputStreamToFile(inputStream, new File(destpath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取表单名称
     *
     * @param workflowid 流程id
     * @return
     */
    public String getTablename(String workflowid) {

        RecordSet recordSet = new RecordSet();

        String tablename = "";

        String sql = "select b.tablename from workflow_base a,workflow_bill b" +
                " where a.formid = b.id and a.id = " + Util.getIntValue(workflowid, 0);

        recordSet.executeSql(sql);
        if (recordSet.next()) {
            tablename = Util.null2String(recordSet.getString("tablename"));
        }

        return tablename;
    }

    /**
     * 把上传的签章文件 创建成附件 保存到流程中
     *
     * @param workflowid    流程id
     * @param requestid     请求id
     * @param imageFileName 文件名称
     * @param fileRealPath  文件绝对路径
     * @param userid        用户id
     * @param nodeid        节点id
     */
    public void saveSignQFile(String workflowid, String requestid, String imageFileName, String fileRealPath1, String userID, String upassword, String nodeid) {

        String categoryid = fileUtil.getDocCategory(workflowid, 0);
        if (categoryid.lastIndexOf(",") > 0) {
            categoryid = categoryid.substring(categoryid.lastIndexOf(",") + 1);
        }

        //创建脱密附件
        String docid2 = fileUtil.createDoc(imageFileName, fileRealPath1, userID, upassword, categoryid);
        writeLog("创建doc返回ID2："+docid2);
        //更新到流程中
        if (Util.getIntValue(docid2, 0) > 0) {

            UpdateWfSignQFile(workflowid, requestid, docid2, nodeid);
        }
    }

    /**
     * 更新签章文件到流程中
     *
     * @param workflowid 流程id
     * @param requestid  请求id
     * @param docid      文档id
     * @param nodeid     节点id
     * @return
     */
    public boolean UpdateWfSignQFile(String workflowid, String requestid, String docid1, String nodeid) {

        RecordSet recordSet = new RecordSet();
        boolean flag = true;
        String tablename = getTablename(workflowid);

        String sql = "select * from workflow_signinfo where WORKFLOWID = '"+workflowid+"' and signnodeid = '"+nodeid+"' ";
        recordSet.execute(sql);
        String qsignfieldname = Util.null2String(recordSet.getString("qsignfieldname"));

        String sql1 = "update " + tablename + " set cebxpdf = '"+docid1+"' where requestid=" + Util.getIntValue(requestid, 0);
        writeLog("更新pdf和移动浏览文件SQL："+sql1);
        flag = recordSet.executeSql(sql1);

        return flag;
    }
}
