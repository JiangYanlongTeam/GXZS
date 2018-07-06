package weaver.interfaces.workflow.action.gx;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;

public class Meetingfjupdate extends BaseBean implements Action {
    public String execute(RequestInfo request) {
        RecordSet rs = new RecordSet();
        //取明细数据
        DetailTable[] detailtable = request.getDetailTableInfo().getDetailTable();// 获取所有明细表
        String ytk = "";
        if (detailtable.length > 0) {
            for (int i = 0; i < detailtable.length; i++) {

                DetailTable dt = detailtable[i];// 指定明细表
                Row[] s = dt.getRow();// 当前明细表的所有数据,按行存储
                for (int j = 0; j < s.length; j++) {

                    Row r = s[j];// 指定行
                    Cell c[] = r.getCell();// 每行数据再按列存储
                    for (int k = 0; k < c.length; k++) {

                        Cell c1 = c[k];// 指定列
                        String name = c1.getName();// 明细字段名称
                        String value = c1.getValue();// 明细字段的值
                        if (name.equals("ytk")) {
                            ytk = value;
                            if(null != ytk && !"".equals(ytk)) {
                                rs.executeSql("select field08 from  formtable_main_25 where requestId=" + ytk);
                                rs.next();
                                String field08 = Util.null2String(rs.getString("field08"));
                                String meetingfj = "update formtable_main_313_dt1  set detailfield02='" + field08 + "'  where ytk=" + ytk;
                                writeLog("更新会议资料" + meetingfj);
                                rs.execute(meetingfj);
                            }
                        }
                    }
                }
            }
        }
        return Action.SUCCESS;
    }
}
