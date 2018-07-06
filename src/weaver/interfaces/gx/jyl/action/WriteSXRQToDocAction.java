package weaver.interfaces.gx.jyl.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 回写失效日期
 * 
 * @author jiangyanlong
 *
 */
public class WriteSXRQToDocAction extends BaseBean implements Action {

	// 回写失效日期+失效时间到文档字段中
	@Override
	public String execute(RequestInfo request) {

		// 文档字段
		String docid = "";
		String docdate = "";
		String doctime = "";
		String sfxysxrq_col = "sfxysxrq";
		String sfxysxrq = "";
		String sxrq = getPropValue("DocSX", "sxrq");
		String sxsj = getPropValue("DocSX", "sxsj");
		String sxwdid = getPropValue("DocSX", "sxwdid");

		Property[] properties = request.getMainTableInfo().getProperty();
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();
			String value = Util.null2String(properties[i].getValue());
			if (name.equals(sxrq)) {
				docdate = value;
			}
			if (name.equals(sxsj)) {
				doctime = value;
			}
			if (name.equals(sxwdid)) {
				docid = value;
			}
			if (name.equals(sfxysxrq_col)) {
				sfxysxrq = value;
			}
		}

		writeLog("失效文档ID:" + docid);
		writeLog("文档失效日期:" + docdate);
		writeLog("文档失效时间:" + doctime);
		writeLog("是否需要失效日期:" + sfxysxrq);//0 是 1 否

		if ("1".equals(sfxysxrq)) {
			return SUCCESS;
		}
		
		if ("".equals(docid)) {
			request.getRequestManager().setMessageid("Failed");
			request.getRequestManager().setMessagecontent("失效文档不能为空");
			return SUCCESS;
		}
		if ("".equals(docdate)) {
			request.getRequestManager().setMessageid("Failed");
			request.getRequestManager().setMessagecontent("文档失效日期不能为空");
			return SUCCESS;
		}
		if ("".equals(doctime)) {
			request.getRequestManager().setMessageid("Failed");
			request.getRequestManager().setMessagecontent("文档失效时间不能为空");
			return SUCCESS;
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			if ((simpleDateFormat.parse(docdate).equals(simpleDateFormat1.parse(simpleDateFormat1.format(new Date())))
					|| simpleDateFormat.parse(docdate)
							.before(simpleDateFormat1.parse(simpleDateFormat1.format(new Date()))))) {
				request.getRequestManager().setMessageid("Failed");
				request.getRequestManager().setMessagecontent("失效日期只能在当前日期之后");
				return SUCCESS;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String sql = "update docdetail set docinvaldate = '" + docdate + "', docinvaltime = '" + doctime
				+ "',invalidationdate = '" + docdate + "' where id = '" + docid + "'";
		writeLog("更新文档失效日期时间:" + sql);
		RecordSet rs = new RecordSet();
		rs.execute(sql);
		return SUCCESS;
	}
}
