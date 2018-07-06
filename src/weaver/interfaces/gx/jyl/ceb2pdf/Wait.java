package weaver.interfaces.gx.jyl.ceb2pdf;

import org.apache.axis.encoding.Base64;
import weaver.conn.RecordSet;
import weaver.docs.webservices.DocAttachment;
import weaver.docs.webservices.DocInfo;
import weaver.docs.webservices.DocService;
import weaver.docs.webservices.DocServiceImpl;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.workflow.webservices.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Map;

public class Wait extends BaseBean implements WaitService {

	private String server;
	private String port;
	private String userName;
	private String userPassword;
	private String directory;
	private String requestid;
	private String pdfName;
	private String status;
	private String errorCode;
	private String storePath;
	private String loginname;
	private String loginpwd;
	private String dirid;
	private String message;
	private String PDFDocName;
	private String WarnTimeFlag;

	public String StatusChange(String serialID, String status, String pdfFileName, String ErrorCode, String RequestID, String PDFDocName, String WarnTimeFlag) {
		writeLog("接收参数：serialID:"+serialID + " status:" + status + " pdfFileName:" + pdfFileName + " ErrorCode:"+ErrorCode + " RequestID:"+RequestID + " PDFDocName:"+PDFDocName);
		this.server = Util.null2String(getPropValue("ceb2pdf", "ftpserver"));
		this.port = Util.null2String(getPropValue("ceb2pdf", "port"));
		this.userName = Util.null2String(getPropValue("ceb2pdf", "ftpuser"));
		this.userPassword = Util.null2String(getPropValue("ceb2pdf", "ftppassword"));
		this.directory = Util.null2String(getPropValue("ceb2pdf", "directory"));
		this.storePath = Util.null2String(getPropValue("ceb2pdf", "downPath"));
		this.loginname = Util.null2String(getPropValue("ceb2pdf", "loginname"));// gw
		this.loginpwd = Util.null2String(getPropValue("ceb2pdf", "loginpwd"));// 1
		this.dirid = Util.null2String(getPropValue("ceb2pdf", "dirid"));// 1
		this.requestid = RequestID;
		this.pdfName = pdfFileName;
		this.status = status;
		this.errorCode = ErrorCode;
		this.PDFDocName = PDFDocName;
		this.WarnTimeFlag = WarnTimeFlag;
		return execute();
	}

	public String execute() {
		if (!"1".equals(status)) {
			writeLog("{\"status\":\"0\",\"message\":\"接收为失败消息，不处理，errorcode为：" + errorCode + "\"}");
			return "{\"status\":\"0\",\"message\":\"接收为失败消息，不处理，errorcode为：" + errorCode + "\"}";
		}
		
		FTPUtil util = new FTPUtil(this.server, Integer.parseInt(this.port), this.userName, this.userPassword);
		boolean isLogin = util.login();
		writeLog("登录："+isLogin);
		if (isLogin) {
			String[] pdfNames = pdfName.split("\\\\");
			String[] PDFDocNames = PDFDocName.split("\\\\");
			StringBuffer sb = new StringBuffer(",");
			for(int i = 0; i < pdfNames.length; i++) {
				if(!PDFDocNames[i].equals("")) {
					boolean isDownload = util.downloadFile(this.directory, pdfNames[i], this.storePath);
					writeLog("下载："+isDownload);
					if (isDownload) {
						int docid = createDocFile(PDFDocNames[i], PDFDocNames[i], this.storePath + File.separator + pdfNames[i]);
						writeLog("创建文档："+docid);
						if (docid > 0) {
							sb.append(docid);
							sb.append(",");
						} else {
							return "{\"status\":\"0\",\"message\":\"" + this.message + "\"}";
						}
					} else {
						writeLog("{\"status\":\"0\",\"message\":\"" + util.message + "\"}");
						return "{\"status\":\"0\",\"message\":\"" + util.message + "\"}";
					}
				}
			}
			String sbs = "";
			if(!",".equals(sb.toString())) {
				sbs = sb.toString();
				sbs = sbs.substring(1,sbs.length()-1);
			} else {
				sbs = "";
			}
			writeFileIDOTHER(sbs, requestid);
		} else {
			writeLog("{\"status\":\"0\",\"message\":\"" + util.message + "\"}");
			return "{\"status\":\"0\",\"message\":\"" + util.message + "\"}";
		}
		boolean isExist = isExistInSignInfo(requestid);
		if(!isExist) {
			RecordSet rs = new RecordSet();
			rs.execute("select id from hrmresource where loginid = '" + this.loginname + "'");
			rs.next();
			String loginid = Util.null2String(rs.getString("id"));
			boolean isSubmit = false;
			try {
				isSubmit = SubmitRequest(Integer.parseInt(this.requestid), Integer.parseInt(loginid));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				writeLog("{\"status\":\"0\",\"message\":\"" + e.getMessage() + "\"}");
				return "{\"status\":\"0\",\"message\":\"" + e.getMessage() + "\"}";
			} catch (RemoteException e) {
				e.printStackTrace();
			}
			writeLog("流程自动提交：" + isSubmit);
			if (!isSubmit) {
				writeLog("{\"status\":\"0\",\"message\":\"流程自动提交失败\"}");
				return "{\"status\":\"0\",\"message\":\"流程自动提交失败\"}";
			}
		}
//		if(WarnTimeFlag.equalsIgnoreCase("y")) {
//			Map<String, String> map = new HashMap<String, String>();
//			map.put("mutiresource","1022");
//			try {
//				String datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//				createRequest(map,"1","1","ceb转pdf超过2分钟提醒-"+datetime);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		writeLog("{\"status\":\"1\",\"message\":\"处理成功\"}");
		return "{\"status\":\"1\",\"message\":\"处理成功\"}";
	}

	public String createRequest(Map<String, String> map, String creater, String workflowid, String requestname) throws Exception {
		// 主字段
		WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[map.size()]; // 字段信息
		int count = 0;
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			wrti[count] = new WorkflowRequestTableField();
			wrti[count].setFieldName(key);//
			wrti[count].setFieldValue(val);//
			wrti[count].setView(true);// 字段是否可见
			wrti[count].setEdit(true);// 字段是否可编辑
			count++;
		}

		WorkflowRequestTableRecord[] wrtri = new WorkflowRequestTableRecord[1];// 主字段只有一行数据
		wrtri[0] = new WorkflowRequestTableRecord();
		wrtri[0].setWorkflowRequestTableFields(wrti);

		WorkflowMainTableInfo wmi = new WorkflowMainTableInfo();
		wmi.setRequestRecords(wrtri);

		// 添加工作流id
		WorkflowBaseInfo wbi = new WorkflowBaseInfo();
		wbi.setWorkflowId(workflowid);// workflowid 流程接口演示流程2016==38

		WorkflowRequestInfo wri = new WorkflowRequestInfo();// 流程基本信息
		wri.setCreatorId(creater);// 创建人id
		wri.setRequestLevel("0");// 0 正常，1重要，2紧急
		wri.setRequestName(requestname);
		wri.setWorkflowMainTableInfo(wmi);// 添加主字段数据
		wri.setWorkflowBaseInfo(wbi);

		WorkflowService WorkflowServicePortTypeProxy = new WorkflowServiceImpl();
		String requestid = WorkflowServicePortTypeProxy.doCreateWorkflowRequest(wri, Integer.parseInt(creater));
		return requestid;
	}

	/**
	 * 获得流程的详细信息
	 * 
	 * @param requestid
	 * @return
	 * @throws RemoteException
	 */
	public static WorkflowRequestInfo getRequestInfo(int requestid, int userid) throws RemoteException {
		WorkflowService WorkflowServicePortTypeProxy = new WorkflowServiceImpl();
		WorkflowRequestInfo WorkflowRequestInfo = WorkflowServicePortTypeProxy.getWorkflowRequest(requestid, userid, 0);// 调用接口获取对应requestid的数据
		return WorkflowRequestInfo;
	}

	/**
	 * 提交流程
	 * 
	 * @throws RemoteException
	 */
	public boolean SubmitRequest(int requestid, int userid) throws RemoteException {
		WorkflowRequestInfo WorkflowRequestInfo = getRequestInfo(requestid, userid);
		WorkflowService WorkflowServicePortTypeProxy = new WorkflowServiceImpl();
		String str = WorkflowServicePortTypeProxy.submitWorkflowRequest(WorkflowRequestInfo, requestid, userid,
				"submit", "");
		writeLog("流程自动提交：" + str);
		return "success".equals(str);
	}

	public int createDocFile(String Subject, String fileName, String path) {
		int docid = 0;
		DocService service = new DocServiceImpl();
		String session;
		try {
			session = service.login(this.loginname, this.loginpwd, 0, "127.0.0.1");
			DocInfo doc = service.getDoc(Integer.parseInt(this.dirid), session);// 44711
			DocAttachment da = doc.getAttachments()[0];

			byte[] content = null;
			// 上传附件，创建文档s
			content = null;
			try {
				int byteread;
				byte data[] = new byte[1024];
				InputStream input = new FileInputStream(new File(path));
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				while ((byteread = input.read(data)) != -1) {
					out.write(data, 0, byteread);
					out.flush();
				}
				content = out.toByteArray();
				input.close();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			da.setDocid(0);
			da.setImagefileid(0);
			da.setFilename(fileName+".pdf");
			da.setFilecontent(Base64.encode(content));
			da.setIszip(1);

			doc.setId(0);
			doc.setDocSubject(Subject);
			doc.setAttachments(new DocAttachment[] { da });
			docid = service.createDoc(doc, session);
		} catch (RemoteException e1) {
			e1.printStackTrace();
			this.message = "创建文档失败: " + e1.getMessage();
		} catch (Exception e) {
			e.printStackTrace();
			this.message = "创建文档失败: " + e.getMessage();
		}
		return docid;
	}

	public void writeFileIDOTHER(String docid, String requestid) {
		RecordSet rs = new RecordSet();
		rs.execute(
				"select formid from workflow_base where id = (select workflowid from workflow_requestbase where REQUESTID = '"
						+ requestid + "')");
		rs.next();
		String formid = Util.null2String(rs.getString("formid"));
		String tableName = "formtable_main_" + Math.abs(Integer.parseInt(formid));
		String sql = "update " + tableName + " set cebxpdf = '" + docid + "' where requestid = '" + requestid + "'";
		writeLog("更新表字段zhhfj SQL: " + sql);
		rs.execute(sql);
	}

	public boolean isExistInSignInfo(String requestid) {
		RecordSet recordSet = new RecordSet();
		recordSet.execute("select workflowid,requestid from workflow_requestbase a " +
				"where exists (select * from workflow_signinfo b where b.WORKFLOWID = a.WORKFLOWID) " +
				"and a.REQUESTID = '"+requestid+"'");
		while(recordSet.next()) {
			return true;
		}
		return false;
	}
}
