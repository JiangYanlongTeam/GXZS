<%@ page import="weaver.file.FileUpload" %>
<%@ page import="weaver.formmode.setup.ModeRightInfo" %>
<%@ page import="weaver.general.Util" %>
<%@ page import="weaver.hrm.HrmUserVarify" %>
<%@ page import="weaver.hrm.User" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="weaver.docs.webservices.DocInfo" %>
<%@ page import="weaver.docs.webservices.DocAttachment" %>
<%@ page import="org.apache.axis.encoding.Base64" %>
<%@ page import="weaver.docs.webservices.DocServiceImpl" %>
<%@ page import="java.io.*" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.fileupload.FileItem" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="org.apache.commons.fileupload.FileUploadException" %>
<%@ page import="weaver.interfaces.jiangyl.xzzy.UploadFile" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<HTML>
<HEAD>
    <jsp:useBean id="rs" class="weaver.conn.RecordSet" scope="page"/>
    <LINK href="/css/Weaver_wev8.css" type=text/css rel=STYLESHEET>
    <script src="/js/ecology8/jquery_wev8.js"></script>
    <!--checkbox组件-->
    <link href="/js/ecology8/jNice/jNice/jNice_wev8.css" type=text/css rel=stylesheet>
    <script language=javascript src="/js/ecology8/jNice/jNice/jquery.jNice_wev8.js"></script>
    <!-- 下拉框美化组件-->
    <link href="/js/ecology8/selectbox/css/jquery.selectbox_wev8.css" type=text/css rel=stylesheet>
    <script language=javascript src="/js/ecology8/selectbox/js/jquery.selectbox-0.2_wev8.js"></script>
    <!-- 泛微可编辑表格组件-->
    <link rel="stylesheet" href="/wui/theme/ecology8/weaveredittable/css/WeaverEditTable_wev8.css">
    <script src="/wui/theme/ecology8/weaveredittable/js/WeaverEditTable_wev8.js"></script>

    <script language=javascript src="/js/ecology8/request/e8.browser_wev8.js"></script>

    <link type="text/css" href="/js/ecology8/base/jquery-ui_wev8.css" rel=stylesheet>
    <script type="text/javascript" src="/js/ecology8/base/jquery-ui_wev8.js"></script>

    <script type='text/javascript' src='/js/jquery-autocomplete/lib/jquery.bgiframe.min_wev8.js'></script>
    <script type='text/javascript' src='/js/jquery-autocomplete/jquery.autocomplete_wev8.js'></script>
    <script type='text/javascript' src='/js/jquery-autocomplete/browser_wev8.js'></script>
    <link rel="stylesheet" type="text/css" href="/js/jquery-autocomplete/jquery.autocomplete_wev8.css"/>
    <link rel="stylesheet" type="text/css" href="/js/jquery-autocomplete/browser_wev8.css"/>
    <script language="javascript" src="/wui/theme/ecology8/jquery/js/zDialog_wev8.js"></script>

</HEAD>
<body scroll="no">
    <%
    User user = HrmUserVarify.getUser (request , response) ;

    String fkfjhidden = "";
    String reqid = "";
    String zlid = "";
    String fkfj = "";
    List<UploadFile> list = new ArrayList<UploadFile>();
    try {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setHeaderEncoding("UTF-8");
        List<FileItem> fileItems = upload.parseRequest(request);
        for(FileItem fileItem : fileItems) {
            String fieldName = fileItem.getFieldName();
            String fieldString = fileItem.getString();
            if(fileItem.isFormField()){
                if(fieldName.equals("fkfjhidden")) {
                    fkfjhidden = new String(fieldString.getBytes("ISO8859-1"),"UTF-8");
                }
                if(fieldName.equals("reqid")) {
                    reqid = new String(fieldString.getBytes("ISO8859-1"),"UTF-8");
                }
                if(fieldName.equals("zlid")) {
                    zlid = new String(fieldString.getBytes("ISO8859-1"),"UTF-8");
                }
            } else {
                byte[] content = new byte[102400000];
                String filename = fileItem.getName();
                UploadFile uploadFile;
                if(filename.equals("")) {
                    continue;
                } else {
                    uploadFile = new UploadFile();
                }
                InputStream in = fileItem.getInputStream();
                ByteArrayOutputStream outst = new ByteArrayOutputStream();
                byte buffer[] = new byte[1024];
                int len = 0;
                while((len=in.read(buffer))>0){
                    outst.write(buffer, 0, len);
                }
                content = outst.toByteArray();
                outst.close();
                in.close();
                uploadFile.setFilename(filename);
                uploadFile.setContent(content);
                list.add(uploadFile);
            }
        }
        if(list.isEmpty()) {
            %>
<script>
    var pdialog = parent.getDialog(window);//获取窗口对象；
    var parentWin = parent.getParentWindow(window);//获取父对象；
    parentWin._table.reLoad();
    pdialog.close();
</script>
    <%
        }

        DocServiceImpl docService = new DocServiceImpl();

        for(UploadFile uploadFile : list) {
            DocInfo doc = new DocInfo();

            DocAttachment[] DocAttachments = new DocAttachment[1];
            DocAttachment DocAttachment = new DocAttachment();
            DocAttachment.setDocid(0);
            DocAttachment.setImagefileid(0);
            DocAttachment.setFilerealpath("");
            DocAttachment.setFilename(uploadFile.getFilename());
            DocAttachment.setFilecontent(Base64.encode(uploadFile.getContent()));
            DocAttachments[0] = DocAttachment;


            doc.setId(0);// 默认为0
            doc.setSeccategory(Util.getIntValue("37",0));// 设置文档子目录（当前所属目录）
            doc.setDocSubject(uploadFile.getFilename());// 设置文档标题
            doc.setAttachments(DocAttachments);

            int docid = 0;
            try {
            docid = docService.createDocByUser(doc, user);
            } catch (Exception e) {
            e.printStackTrace();
            }


            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());

            String insertSQL = "insert into uf_fjcc (reqid,zlid,fileid,formmodeid,modedatacreater,modedatacreatertype,modedatacreatedate,modedatacreatetime) "
            + "values ('" + reqid + "','" + zlid + "','" + docid + "','502','1','0','" + date + "','" + time + "')";

            rs.execute(insertSQL);

            String selectMaxIdSQL = "select max(id) id from uf_fjcc";
            rs.execute(selectMaxIdSQL);
            rs.next();
            String id = rs.getString("id");
            ModeRightInfo ModeRightInfo = new ModeRightInfo();
            ModeRightInfo.editModeDataShare(1, 502, Integer.parseInt(id));
        }

    } catch (FileUploadException e) {
        e.printStackTrace();
    }

    %>
<script>
    var pdialog = parent.getDialog(window);//获取窗口对象；
    var parentWin = parent.getParentWindow(window);//获取父对象；
    parentWin._table.reLoad();
    pdialog.close();
</script>
