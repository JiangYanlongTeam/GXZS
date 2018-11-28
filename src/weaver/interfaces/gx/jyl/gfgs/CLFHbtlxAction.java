package weaver.interfaces.gx.jyl.gfgs;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;

import java.util.HashMap;
import java.util.Map;

public class CLFHbtlxAction extends BaseBean implements Action {

    @Override
    public String execute(RequestInfo request) {
        RecordSet recordSet = new RecordSet();
        String requestid = request.getRequestid();
        String tableName = request.getRequestManager().getBillTableName();
        Map<String, Float> map = new HashMap<String, Float>();


        DetailTable[] detailtable = request.getDetailTableInfo().getDetailTable();// 获取所有明细表
        DetailTable dt = detailtable[0];// 指定明细表 0表示明细表1
        Row[] s1 = dt.getRow();// 当前明细表的所有数据,按行存储
        for (int j = 0; j < s1.length; j++) {
            String fyxlValue = "";
            String bxjeValue = "";

            Row r = s1[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (name.equals("fyxl")) {
                    fyxlValue = value;
                }
                if (name.equals("bxje")) {
                    bxjeValue = value;
                }
            }
            if (map.containsKey(fyxlValue)) {
                map.put(fyxlValue, map.get(fyxlValue) + Float.parseFloat(bxjeValue));
            } else {
                map.put(fyxlValue, Float.parseFloat(bxjeValue));
            }
        }

        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            if ("0".equals(key)) {
                String sql = "update " + tableName + " set ctjtf = '" + value + "' where requestid = '" + requestid + "'";
                recordSet.execute(sql);
            }
            if ("1".equals(key)) {
                String sql = "update " + tableName + " set snjtf = '" + value + "' where requestid = '" + requestid + "'";
                recordSet.execute(sql);
            }
            if ("2".equals(key)) {
                String sql = "update " + tableName + " set ccbz = '" + value + "' where requestid = '" + requestid + "'";
                recordSet.execute(sql);
            }
            if ("3".equals(key)) {
                String sql = "update " + tableName + " set zsf = '" + value + "' where requestid = '" + requestid + "'";
                recordSet.execute(sql);
            }
            if ("4".equals(key)) {
                String sql = "update " + tableName + " set ztlclf = '" + value + "' where requestid = '" + requestid + "'";
                recordSet.execute(sql);
            }
        }
        return SUCCESS;
    }
}
