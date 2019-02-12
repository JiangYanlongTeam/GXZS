package weaver.interfaces.gx.jyl.file;

import jxl.read.biff.Record;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import weaver.conn.RecordSet;
import weaver.conn.RecordSetDataSource;
import weaver.docs.docs.DocComInfo;
import weaver.general.BaseBean;
import weaver.general.StringUtil;
import weaver.general.Util;
import weaver.hrm.company.DepartmentComInfo;
import weaver.hrm.company.SubCompanyComInfo;
import weaver.interfaces.gx.jyl.ceb2pdf.Unzip;
import weaver.interfaces.gx.jyl.pdf.FTPUtil;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T_FileAction extends BaseBean implements Action {

    @Override
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String requestname = request.getRequestManager().getRequestname();
        String tableName = request.getRequestManager().getBillTableName();

        M_DFILE m_dfile = new M_DFILE();
        m_dfile.setStatus("0");
        m_dfile.setCreator("OA");
        m_dfile.setCreatetime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        m_dfile.setExtid(requestid);
        m_dfile.setTitle(requestname);


        String sql = "select (select selectname from WORKFLOW_SELECTITEM where fieldid = '15252' and selectvalue = a.field45) field45,a.field02,a.field05,a.field66,a.field09,a.fjpdf, a.field03 , a.field08, b.createdate, a.field11 from " + tableName + " a, workflow_requestbase b where a.requestid = b.requestid and a.requestid = '"+requestid+"'";
        writeLog("获取发文SQL："+sql);
        RecordSet recordSet = new RecordSet();
        recordSet.execute(sql);
        recordSet.next();
        String field66 = Util.null2String(recordSet.getString("field66"));
        String field02 = Util.null2String(recordSet.getString("field02"));
        if(!"".equals(field02)) {
            try {
                field02 = new DepartmentComInfo().getDepartmentname(field02);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String field05 = Util.null2String(recordSet.getString("field05"));
        String field45 = Util.null2String(recordSet.getString("field45"));
        String field03 = Util.null2String(recordSet.getString("field03"));
        String field08 = Util.null2String(recordSet.getString("field08"));
        String createdate = Util.null2String(recordSet.getString("createdate"));
        String field11 = Util.null2String(recordSet.getString("field11"));

        String field09 = Util.null2String(recordSet.getString("field09"));
        String fjpdf = Util.null2String(recordSet.getString("fjpdf"));

        String fj = getMultiAttachNames(field08);

        String[] fjs = field08.split(",");


        String unit = "";
        try {
            unit = new SubCompanyComInfo().getSubcompanynames(field03);
        } catch (Exception e) {
            e.printStackTrace();
        }

        m_dfile.setUnit(unit);
        String efilecount = "";
        if(field08.equals("")) {
            efilecount = Util.null2String(2);
        } else {
            efilecount = Util.null2String(field08.split(",").length + 2);
        }
        m_dfile.setEfilecount(efilecount);
        m_dfile.setZrz(unit);
        m_dfile.setWh(field11);
        m_dfile.setCwrq(createdate);


        writeLog("m_dfile:"+m_dfile.toString());

        String uuid = Util.null2String(new Date().getTime());
        RecordSetDataSource recordSetDataSource = new RecordSetDataSource("qhzg");
        String insertMainSQL = "insert into OA_D_FILE (ID,STATUS,CREATOR,CREATETIME,UNIT,EFILECOUNT,EXTID,TITLE,CWRQ,ZRZ,WH,YS,ZS,BM,FJ,FWLX) values " +
                "('"+uuid+"','"+m_dfile.getStatus()+"','"+m_dfile.getCreator()+"','"+m_dfile.getCreatetime()+"','"+m_dfile.getUnit()+"'," +
                "'"+m_dfile.getEfilecount()+"','"+m_dfile.getExtid()+"','"+m_dfile.getTitle()+"','"+m_dfile.getCwrq()+"'," +
                "'"+m_dfile.getZrz()+"','"+m_dfile.getWh()+"','"+field66+"','"+field05+"','"+field02+"','"+fj+"','"+field45+"')";
        writeLog("插入m_dfile表SQL:"+insertMainSQL);
        recordSetDataSource.execute(insertMainSQL);
        String mainid = uuid;


        if(!"".equals(field08)) {
            for(int i = 0 ; i < fjs.length; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String docid = fjs[i];
                String docsql = "select b.imagefilename,b.filerealpath,b.filesize,b.aescode from DocImageFile a,imagefile b where a.imagefileid = b.imagefileid and a.docid = '"+docid+"'";
                writeLog("获取附件信息SQL:"+docsql);
                recordSet.execute(docsql);
                recordSet.next();
                String imagefilename = Util.null2String(recordSet.getString("imagefilename"));
                writeLog("附件名字:"+imagefilename);
                String type = "";
                String TITLE = "";
                if(imagefilename.contains(".")) {
                    type = imagefilename.substring(imagefilename.lastIndexOf(".")+1,imagefilename.length());
                    TITLE = imagefilename.substring(0,imagefilename.lastIndexOf("."));
                }
                String filesize = Util.null2String(recordSet.getString("filesize"));
                writeLog("附件大小:"+filesize);
                String filerealpath = Util.null2String(recordSet.getString("filerealpath"));
                writeLog("附件路径:"+filerealpath);
                String currentYear = new SimpleDateFormat("yyyy").format(new Date());

                String FILETYPE = "附件";

                File file = new File(filerealpath);
                String fileName = file.getName();
                Unzip unZip = new Unzip();
                unZip.unZip(filerealpath, filerealpath.split(fileName)[0]);
                writeLog("解压成功");
                String rPath = filerealpath.split(fileName)[0] + getFileNameWithoutPrefix(fileName);

                String uuids = Util.null2String(new Date().getTime());
                String _fileName = "";
                if(type.equals("")) {
                    _fileName = uuids;
                } else {
                    _fileName = uuids + "." + type;
                }

                File file1 = new File(rPath);
                String fileNewName = filerealpath.split(fileName)[0]+_fileName;
                boolean renameSuccess = file1.renameTo(new File(fileNewName));
                writeLog("重命名文件:"+renameSuccess);
                writeLog("重命名文件路径:"+fileNewName);
                if(!renameSuccess) {
                    request.getRequestManager().setMessageid("Failed");
                    request.getRequestManager().setMessagecontent("文件重命名失败");
                    return SUCCESS;
                }


                FTPUtil ftpUtil = new FTPUtil("172.21.220.100",21,"sygthams_oa","oa@2018");
                ftpUtil.login();
                boolean isSuccess = ftpUtil.uploadFile(fileNewName,"/"+currentYear);
                if(!isSuccess) {
                    request.getRequestManager().setMessageid("Failed");
                    request.getRequestManager().setMessagecontent("上传失败");
                    ftpUtil.logout();
                    return SUCCESS;
                }

                String fileMD5 = getMD5(new File(fileNewName));
//            try {
//                fileMD5 = DigestUtils.md5Hex(new FileInputStream(fileNewName));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

                String insertSQL = "insert into OA_E_FILE (FILENAME,ID,PID,TITLE,PATHNAME,FILETYPE,FILESIZE,PAGECOUNT,SIGNATURE) values ('"+_fileName+"','"+uuids+"','"+mainid+"','"+imagefilename+"','\\"+currentYear+"','"+FILETYPE+"'," +
                        "'"+filesize+"','','"+fileMD5+"')";
                writeLog("插入明细SQL:"+insertSQL);
                recordSetDataSource.execute(insertSQL);
                ftpUtil.logout();
            }
        }



        if(!field09.equals("")) {
            String docid = field09;
            String docsql = "select b.imagefilename,b.filerealpath,b.filesize,b.aescode from DocImageFile a,imagefile b where a.imagefileid = b.imagefileid and a.docid = '"+docid+"'";
            recordSet.execute(docsql);
            recordSet.next();
            String imagefilename = Util.null2String(recordSet.getString("imagefilename"));
            writeLog("附件名字:"+imagefilename);
            String type = "";
            String TITLE = "";
            if(imagefilename.contains(".")) {
                type = imagefilename.substring(imagefilename.lastIndexOf(".")+1,imagefilename.length());
                TITLE = imagefilename.substring(0,imagefilename.lastIndexOf("."));
            }
            String filesize = Util.null2String(recordSet.getString("filesize"));
            writeLog("附件大小:"+filesize);
            String filerealpath = Util.null2String(recordSet.getString("filerealpath"));
            writeLog("附件路径:"+filerealpath);
            String currentYear = new SimpleDateFormat("yyyy").format(new Date());

            String FILETYPE = "正文";

            File file = new File(filerealpath);
            String fileName = file.getName();
            Unzip unZip = new Unzip();
            unZip.unZip(filerealpath, filerealpath.split(fileName)[0]);
            writeLog("解压成功");
            String rPath = filerealpath.split(fileName)[0] + getFileNameWithoutPrefix(fileName);

            String uuids = Util.null2String(new Date().getTime());
            String _fileName = "";
            if(type.equals("")) {
                _fileName = uuids;
            } else {
                _fileName = uuids + "." + type;
            }

            File file1 = new File(rPath);
            String fileNewName = filerealpath.split(fileName)[0]+_fileName;
            boolean renameSuccess = file1.renameTo(new File(fileNewName));
            writeLog("重命名文件:"+renameSuccess);
            writeLog("重命名文件路径:"+fileNewName);
            if(!renameSuccess) {
                request.getRequestManager().setMessageid("Failed");
                request.getRequestManager().setMessagecontent("文件重命名失败");
                return SUCCESS;
            }


            FTPUtil ftpUtil = new FTPUtil("172.21.220.100",21,"sygthams_oa","oa@2018");
            ftpUtil.login();
            boolean isSuccess = ftpUtil.uploadFile(fileNewName,"/"+currentYear);
            if(!isSuccess) {
                request.getRequestManager().setMessageid("Failed");
                request.getRequestManager().setMessagecontent("上传失败");
                ftpUtil.logout();
                return SUCCESS;
            }

            String fileMD5 = getMD5(new File(fileNewName));
//            try {
//                fileMD5 = DigestUtils.md5Hex(new FileInputStream(fileNewName));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            String insertSQL = "insert into OA_E_FILE (FILENAME,ID,PID,TITLE,PATHNAME,FILETYPE,FILESIZE,PAGECOUNT,SIGNATURE) values ('"+_fileName+"','"+uuids+"','"+mainid+"','"+requestname+"','\\"+currentYear+"','"+FILETYPE+"'," +
                    "'"+filesize+"','"+field66+"','"+fileMD5+"')";
            writeLog("插入明细SQL:"+insertSQL);
            recordSetDataSource.execute(insertSQL);
            ftpUtil.logout();
        }

        if(!fjpdf.equals("")) {
            String docid = fjpdf;
            String docsql = "select b.imagefilename,b.filerealpath,b.filesize,b.aescode from DocImageFile a,imagefile b where a.imagefileid = b.imagefileid and a.docid = '"+docid+"'";
            recordSet.execute(docsql);
            recordSet.next();
            String imagefilename = Util.null2String(recordSet.getString("imagefilename"));
            writeLog("附件名字:"+imagefilename);
            String type = "";
            String TITLE = "";
            if(imagefilename.contains(".")) {
                type = imagefilename.substring(imagefilename.lastIndexOf(".")+1,imagefilename.length());
                TITLE = imagefilename.substring(0,imagefilename.lastIndexOf("."));
            }
            String filesize = Util.null2String(recordSet.getString("filesize"));
            writeLog("附件大小:"+filesize);
            String filerealpath = Util.null2String(recordSet.getString("filerealpath"));
            writeLog("附件路径:"+filerealpath);
            String currentYear = new SimpleDateFormat("yyyy").format(new Date());

            String FILETYPE = "发文单";

            String uuids = Util.null2String(new Date().getTime());
            String _fileName = "";
            if(type.equals("")) {
                _fileName = uuids;
            } else {
                _fileName = uuids + "." + type;
            }

            File file = new File(filerealpath);
            String fileName = file.getName();
            Unzip unZip = new Unzip();
            unZip.unZip(filerealpath, filerealpath.split(fileName)[0]);
            writeLog("解压成功");
            String rPath = filerealpath.split(fileName)[0] + getFileNameWithoutPrefix(fileName);

            File file1 = new File(rPath);
            String fileNewName = filerealpath.split(fileName)[0]+_fileName;
            boolean renameSuccess = file1.renameTo(new File(fileNewName));
            writeLog("重命名文件:"+renameSuccess);
            writeLog("重命名文件路径:"+fileNewName);
            if(!renameSuccess) {
                request.getRequestManager().setMessageid("Failed");
                request.getRequestManager().setMessagecontent("文件重命名失败");
                return SUCCESS;
            }


            FTPUtil ftpUtil = new FTPUtil("172.21.220.100",21,"sygthams_oa","oa@2018");
            ftpUtil.login();
            boolean isSuccess = ftpUtil.uploadFile(fileNewName,"/"+currentYear);
            if(!isSuccess) {
                request.getRequestManager().setMessageid("Failed");
                request.getRequestManager().setMessagecontent("上传失败");
                ftpUtil.logout();
                return SUCCESS;
            }

            String fileMD5 = getMD5(new File(fileNewName));
//            try {
//                fileMD5 = DigestUtils.md5Hex(new FileInputStream(fileNewName));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            String insertSQL = "insert into OA_E_FILE (FILENAME,ID,PID,TITLE,PATHNAME,FILETYPE,FILESIZE,PAGECOUNT,SIGNATURE) values ('"+_fileName+"','"+uuids+"','"+mainid+"','"+requestname+"','\\"+currentYear+"','"+FILETYPE+"'," +
                    "'"+filesize+"','"+field66+"','"+fileMD5+"')";
            writeLog("插入明细SQL:"+insertSQL);
            recordSetDataSource.execute(insertSQL);
            ftpUtil.logout();

        }
        return SUCCESS;
    }

    /**
     * 获取文件名字，不要后缀
     *
     * @param s
     * @return
     */
    public static String getFileNameWithoutPrefix(String s) {
        return s.substring(0, s.lastIndexOf("."));
    }

    public static void main(String[] args) {

        File file = new File("/Users/wangshanshan/Desktop/1268184024.zip");
        String fileName = file.getName();
        Unzip unZip = new Unzip();
        unZip.unZip("/Users/wangshanshan/Desktop/1268184024.zip", "/Users/wangshanshan/Desktop/1268184024.zip".split(fileName)[0]);
        String rPath = "/Users/wangshanshan/Desktop/1268184024.zip".split(fileName)[0] + getFileNameWithoutPrefix(fileName);

        File file1 = new File(rPath);
        file1.renameTo(new File("/Users/wangshanshan/Desktop/1268184024.zip".split(fileName)[0]+"国信集团总经理办公会议纪要[2015]28号.doc"));

        try {
            String fileMD5 = DigestUtils.md5Hex(new FileInputStream("/Users/wangshanshan/Desktop/国信集团总经理办公会议纪要[2015]28号.doc"));
            System.out.println(fileMD5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getMD5(File file) {
        FileInputStream fileInputStream = null;
        try {
            MessageDigest MD5 = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[8192];
            int length;
            while ((length = fileInputStream.read(buffer)) != -1) {
                MD5.update(buffer, 0, length);
            }
            return new String(Hex.encodeHex(MD5.digest()));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        } finally {
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public String getMultiAttachNames(String docids) {
        if("".equals(Util.null2String(docids))) {
            return "";
        }
        RecordSet recordSet = new RecordSet();
        recordSet.execute("select listagg(b.imagefilename,',')  WITHIN GROUP (order by docid) attachenames from DocImageFile a,imagefile b where a.imagefileid = b.imagefileid and a.docid in ("+docids+") ");
        recordSet.next();
        String attachenames = Util.null2String(recordSet.getString("attachenames"));
        return attachenames;
    }
}
