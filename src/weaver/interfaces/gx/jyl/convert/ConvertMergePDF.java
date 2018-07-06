package weaver.interfaces.gx.jyl.convert;

import com.wafa.convert.webservice.ConvertServiceProxy;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;

import java.rmi.RemoteException;
import java.util.*;
//import weaver.interfaces.ceb.webservices.ReportResultImp;

/**
 * 敏行 文件转换、合并类
 * @author Administrator
 *
 */
public class ConvertMergePDF extends BaseBean{

    public String wsdlurl = "http://10.254.45.5:8088/convert/webservice/ConvertService";
    public String furl = "http://10.254.45.5:8088";
    public String strDestFolder = "D:\\Tomcat-7-ConvertService\\webapps\\convert\\OAdest\\";
    public String strTellResultWebservice = "http://10.254.45.3:8080/services/ReportResultPDF?wsdl";
    private ConvertServiceProxy proxy = null;

    public void init(){
        try {
            proxy = new ConvertServiceProxy(wsdlurl);
        } catch (Exception e) {
        }
    }


    /**
     * 文件合并
     * @param fileurl 文件 路径
     * @param strDestFolder  合并结果文件存放到此目录
     * @param nDestFileType  文件类型， 0为PDF ，1为CEB，2为CEBX。
     * @param nPriority  转换优先级，0，1，2，3，4，5
     * @param strTellResultWebservice
     * @param size
     * @return 返回 jobid
     */
    public String ConcatFiles(String fileurl,String strDestFolder,int nDestFileType,int nPriority,String strTellResultWebservice,int size){
        int jobID = 0;
        String status = "0";
        String JobResult = "";

        writeLog("[ConvertFile]fileurl:"+fileurl);

        try {
            JobResult = proxy.concatFiles(fileurl, strDestFolder, nDestFileType, nPriority, strTellResultWebservice,"file concatfiles");

            JobResult = getJobID(JobResult);//获取任务ID

        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            writeLog("ConcatFiles:"+e.toString());
        }

        return JobResult;
    }

    /**
     * 文件合并
     * @param fileurl  文件 http路径
     * @param nDestFileType 文件类型， 0为PDF ，1为CEB，2为CEBX。
     * @param size 文件大小
     * @return
     */
    public String ConcatFiles_JobResult(String fileurl,int nDestFileType,int size){
        String jobID = "";
        String status = "0";
        int nPriority = 0;
        String JobResult = "";

        //合并获取jobid
        jobID = ConcatFiles(fileurl,this.strDestFolder,nDestFileType,nPriority,this.strTellResultWebservice,size);

        JobResult = getJobResultStr_New(Util.getIntValue(jobID, 0)); //获取任务结果

        return JobResult;
    }

    /**
     * 文件合并
     * @param fileurl  文件 http路径
     * @param nDestFileType 文件类型， 0为PDF ，1为CEB，2为CEBX。
     * @param size 文件大小
     * @return 返回jobid
     */
    public String ConcatFiles_JobID(String fileurl,int nDestFileType,int size){
        int jobID = 0;
        String status = "0";
        int nPriority = 0;
        String JobResult = "";

        JobResult = ConcatFiles(fileurl, this.strDestFolder, nDestFileType, nPriority, this.strTellResultWebservice, size);

        return JobResult+"";
    }


    /**
     * 获取某任务的任务ID
     * @param ResultStr
     * @return
     */
    public String getJobID(String ResultStr){

        String jobid = "";
        String status = "";

        HashMap hashMap = new HashMap();
        hashMap.put("jobid", "9");
        hashMap.put("jobstatus", "9");

        StringBuffer buffer = new StringBuffer();
        buffer.append(ResultStr.replaceAll("\"\"", "\""));
        String nodestr = "//root";

        List list = xmlList(hashMap,buffer,nodestr);

        if(list.size()>0){
            Map m = (Map) list.get(0);
            status = (String) m.get("jobstatus");
            jobid = (String) m.get("jobid");
        }

        writeLog("任务ID:"+jobid+"   任务状态:"+status);

        return jobid;

    }

    /**
     * 获取某任务的执行结果
     * @param jobID  任务ID
     * @return
     */
    public String getJobResultStr(int jobID){

        String status = "0";
        String JobResult = "";

        try{

            //获取任务状态，每5秒查询一次
            while(status.equals("0")||status.equals("2")){ //
                try {
                    Thread.sleep(5000); //休眠 5秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                status = proxy.getJobStatusByID(jobID); //0表示还没有转，1表示已正确转完, 2表示正在处理中，3表示失败，4表示跳过

                HashMap hashMap = new HashMap();
                hashMap.put("status", "9");
                hashMap.put("fileName", "9");

                StringBuffer buffer = new StringBuffer();
                buffer.append(status.replaceAll("\"\"", "\""));
                String nodestr = "//root/data/itemList/item";

                List list = xmlList(hashMap,buffer,nodestr);

                if(list.size()>0){

                    Map m = (Map) list.get(0);
                    status = (String) m.get("status");
                }
            }

            writeLog("getJob status:"+status);

            // 获取任务返回结果  每2秒查询一次，如果20秒还未收取结果 循环跳出
            //ReportResultImp imp = new ReportResultImp();
            int i = 0;
            while(JobResult.equals("")){

                //JobResult = imp.getJobResult(jobID);//获取任务返回结果
                JobResult = getJobResult(jobID);//获取任务返回结果
                try {
                    Thread.sleep(2000);//休眠 2秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(i>20&&JobResult.equals("")){ //如果20秒还未收取结果 循环跳出
                    JobResult = "0";
                }

                i++;
            }
            writeLog("getJob :"+JobResult);
            //Thread.sleep(5000);
            if(!JobResult.equals("0")){

                String[] jobResults = JobResult.split("\\|");
                for (int j = 0; j < jobResults.length; j++) {
                    if(j==0){
                        JobResult = furl+"/Convertor/ConvertData/OAdest/"+jobResults[j];
                    }else{
                        JobResult += "|"+furl+"/Convertor/ConvertData/OAdest/"+jobResults[j];
                    }
                }

            }else{
                JobResult = "";
            }
        }catch (Exception e) {
            // TODO: handle exception
            writeLog("getJobResultStr:"+e.toString());
        }

        return JobResult;
    }

    /**
     * 获取某任务的执行结果
     * @param jobID  任务ID
     * @return
     */
    public String getJobResultStr_New(int jobID){

        String status = "0";
        String JobResult = "";

        try{

            //获取任务状态，每5秒查询一次
            while(status.equals("0")||status.equals("2")){ //
                try {
                    Thread.sleep(5000); //休眠 5秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                status = proxy.getJobStatusByID(jobID); //0表示还没有转，1表示已正确转完, 2表示正在处理中，3表示失败，4表示跳过

                HashMap hashMap = new HashMap();
                hashMap.put("status", "9");
                hashMap.put("fileName", "9");

                StringBuffer buffer = new StringBuffer();
                buffer.append(status.replaceAll("\"\"", "\""));
                String nodestr = "//root/data/itemList/item";

                List list = xmlList(hashMap,buffer,nodestr);

                if(list.size()>0){

                    Map m = (Map) list.get(0);
                    status = (String) m.get("status");
                    JobResult = (String) m.get("fileName");
                }
            }

            if("".equals(JobResult)|| JobResult==null){
                JobResult = "0";
            }

            writeLog("getJobResultStr结果:"+JobResult);

            Thread.sleep(2000);
            if(!JobResult.equals("0")){

                String[] jobResults = JobResult.split("\\|");
                for (int j = 0; j < jobResults.length; j++) {
                    if(j==0){
                        JobResult = furl+"/Convertor/ConvertData/OAdest/"+jobResults[j];
                    }else{
                        JobResult += "|"+furl+"/Convertor/ConvertData/OAdest/"+jobResults[j];
                    }
                }

            }else{
                JobResult = "";
            }
        }catch (Exception e) {
            // TODO: handle exception
            writeLog("getJobResultStr:"+e.toString());
        }

        return JobResult;
    }

    /**
     * 获取任务执行结果
     * @param nJobid 任务id
     * @return
     */
    public String getJobResult(int nJobid) {
        // TODO Auto-generated method stub
        String jobResult = "";

        String sql = "select jobid,jobresult,status from cebjobresult where jobid="+nJobid+" order by id desc";

        int status = 0;

        RecordSet rs = new RecordSet();
        rs.executeSql(sql);
        if(rs.next()){
            status = rs.getInt("status");
            jobResult = rs.getString("jobResult");
            if(jobResult==null || "".equals(jobResult)){
                jobResult = "0";
            }

            if(status!=1){
                jobResult = "0";
            }
        }

        return jobResult;
    }


    /**
     * 解析xml
     * @param hashMap
     * @param xml xmlstr
     * @param nodestr
     * @return
     */
    public static List xmlList(HashMap hashMap,StringBuffer xml,String nodestr){

        String strxml = "";

        List talist = new ArrayList();

        strxml = xml.toString();

        try {
            Document docu=DocumentHelper.parseText(strxml);

            List list = docu.selectNodes(nodestr); //找到某个元素的子元素集合

            //talist.add(hashMap);

            Set keys = hashMap.keySet(); //key值


            for (int i = 0; i < list.size(); i++) { //遍历List

                HashMap map2 = new HashMap();

                Element table=((Element) list.get(i)); //获取某行子元素

                Iterator ccIterator =keys.iterator();
                while(ccIterator.hasNext()){ //遍历
                    String key = (String)ccIterator.next(); //字段名
                    String value = "";
                    Element id = table.element(key);  //根据元素名 获取元素3

                    if(id!=null){ //判断是否存在该元素
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
