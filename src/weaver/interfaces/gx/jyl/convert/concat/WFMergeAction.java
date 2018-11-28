package weaver.interfaces.gx.jyl.convert.concat;

import com.wafa.convert.webservice.ConvertServiceProxy;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import weaver.docs.proce.CebFileUtil;
import weaver.docs.proce.DocFileInfo;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;
import weaver.system.ceb.workflowFile;

import java.rmi.RemoteException;
import java.util.*;

public class WFMergeAction extends BaseBean implements Action {

    private static String destDir = "D:\\Tomcat-7-ConvertService\\webapps\\convert\\OAdest\\";
    private static String tellWsdl = "http://10.254.45.3:8080/services/ReportPDF?wsdl";

    @Override
    public String execute(RequestInfo request) {
        int requestid = Util.getIntValue(request.getRequestid(), 0);//请求id
        int workflowid = Util.getIntValue(request.getWorkflowid(), 0);//流程id
        int formid = Util.getIntValue(request.getRequestManager().getFormid() + "", 0);//表单id
        int userid = Util.getIntValue(request.getLastoperator(), 0);//当前操作人
        int nodeid = request.getRequestManager().getNodeid();

        WorkflowFileCMInfo wfcminfo = new WorkflowFileCMInfo(workflowid, true);

        boolean SignFlag = wfcminfo.isSignFlag();

        RequestFileCMInfo rfcminfo = new RequestFileCMInfo(workflowid, nodeid, requestid, formid, wfcminfo);
        rfcminfo.init();
        CebFileUtil cebutil = new CebFileUtil();

        String hzname = "";   //正文后缀
        String fileHname = ""; //正文文件名称
        String fileTrueName = ""; //正文相对路径
        String fileRealPath = ""; //正文绝对路径
        String url = "10.254.45.3:8080";
        int wjsize = 0;

        String hzname2 = ""; //附件后缀
        String fileHname2 = ""; //附件文件名称
        String fileTrueName2 = ""; //附件相对路径
        String fileRealPath2 = ""; //附件绝对路径

        String srcurlTrueName = "";  //需转换文件下载路径

        String cebxurl = ""; //文件路径

        int buttonid = 0;


        if (SignFlag) {

            buttonid = wfcminfo.getButtonid();

            writeLog("[主文档字段]" + wfcminfo.getSignfieldname() + ",值：" + rfcminfo.getSignattid() + "");
            DocFileInfo zw = new DocFileInfo(Util.getIntValue(rfcminfo.getSignattid() + "", 0)); //获取正文信息
            hzname = zw.getHzname();
            fileHname = zw.getFileHname();
            fileTrueName = zw.getFileTrueName();
            fileRealPath = zw.getFileRealPath();
            fileTrueName = fileTrueName.replace("\\", "/");
            wjsize = zw.getSize();
            cebutil.UnZip(fileRealPath, hzname); //解压文件

//            writeLog("[附件字段]" + wfcminfo.getFujian() + ",值：" + rfcminfo.getFujian() + "");
//            String[] othernames = Util.TokenizerString2(rfcminfo.getFujian(), ",");
//            int fcou = 0;
//            for (int i = 0; i < othernames.length; i++) {
//
//                DocFileInfo wj = new DocFileInfo(Util.getIntValue(othernames[i], 0)); //获取文件信息
//
//                if (!"".equals(wj.getHzname())) {
//                    if (fcou == 0) {
//                        srcurlTrueName += "http://" + url + "/" + wj.getFileTrueName();
//
//                    } else {
//                        srcurlTrueName += "|" + "http://" + url + "/" + wj.getFileTrueName();
//
//                    }
//                    fcou++;
//                }
//
//                cebutil.UnZip(wj.getFileRealPath(), wj.getHzname());     //解压文件
//
//            }

            if (srcurlTrueName.length() > 0) {

                srcurlTrueName = "http://" + url + "/" + fileTrueName + "|" + srcurlTrueName;
            } else {
                srcurlTrueName = "http://" + url + "/" + fileTrueName;
                //srcurlTrueName = "";
            }

            ConvertServiceProxy proxy = new ConvertServiceProxy();
            try {
                writeLog("srcurlTrueName:"+srcurlTrueName);
                writeLog("destDir:"+destDir);
                writeLog("tellWsdl:"+tellWsdl);
                String result = proxy.concatFiles(srcurlTrueName, destDir, 0, 0, tellWsdl,"convert to pdf");
                writeLog("result:"+result);
                String jobid = getJobID(result);
                writeLog("jobid:"+jobid);
                if (Util.getIntValue(jobid, 0) > 0) {
                    boolean ff = workflowFile.UpdateCebjobresultSign(requestid, Util.getIntValue(jobid), wfcminfo.getId(), wfcminfo.getQsignfieldname(), rfcminfo.getFormid(), userid);
                    if (!ff) {
                        request.getRequestManager().setMessageid("Failed");
                        request.getRequestManager().setMessagecontent("正文转PDF失败，任务编号:" + jobid + "");
                        return Action.SUCCESS;
                    }
                } else {
                    request.getRequestManager().setMessageid("Failed");
                    request.getRequestManager().setMessagecontent("正文转PDF失败，任务编号:" + jobid + "");
                    return Action.SUCCESS;
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return SUCCESS;
    }

    /**
     * 获取某任务的任务ID
     *
     * @param ResultStr
     * @return
     */
    public String getJobID(String ResultStr) {

        String jobid = "";
        String status = "";

        HashMap hashMap = new HashMap();
        hashMap.put("jobid", "9");
        hashMap.put("jobstatus", "9");

        StringBuffer buffer = new StringBuffer();
        buffer.append(ResultStr.replaceAll("\"\"", "\""));
        String nodestr = "//root";

        List list = xmlList(hashMap, buffer, nodestr);

        if (list.size() > 0) {
            Map m = (Map) list.get(0);
            status = (String) m.get("jobstatus");
            jobid = (String) m.get("jobid");
        }

        writeLog("任务ID:" + jobid + "   任务状态:" + status);

        return jobid;

    }

    /**
     * 解析xml
     *
     * @param hashMap
     * @param xml     xmlstr
     * @param nodestr
     * @return
     */
    public static List xmlList(HashMap hashMap, StringBuffer xml, String nodestr) {

        String strxml = "";

        List talist = new ArrayList();

        strxml = xml.toString();

        try {
            Document docu = DocumentHelper.parseText(strxml);

            List list = docu.selectNodes(nodestr); //找到某个元素的子元素集合

            //talist.add(hashMap);

            Set keys = hashMap.keySet(); //key值


            for (int i = 0; i < list.size(); i++) { //遍历List

                HashMap map2 = new HashMap();

                Element table = ((Element) list.get(i)); //获取某行子元素

                Iterator ccIterator = keys.iterator();
                while (ccIterator.hasNext()) { //遍历
                    String key = (String) ccIterator.next(); //字段名
                    String value = "";
                    Element id = table.element(key);  //根据元素名 获取元素3

                    if (id != null) { //判断是否存在该元素
                        value = id.getText(); //获取元素文本
                    }

                    map2.put(key, value);
                }

                talist.add(map2);

            }

        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return talist;
    }
}
