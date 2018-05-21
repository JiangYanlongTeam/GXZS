package weaver.interfaces.gx.jyl.gfgs;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 资金支付转换人员信息
 *
 * Created by jiangyanlong on 2017/4/18.
 */
public class JTCWZJZFTranslateAction extends BaseBean implements Action {

    public String execute(RequestInfo request) {
        String ygbh_column = "BNAME";
        String ygbh_value = "";
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(ygbh_column)) {
                ygbh_value = value;
            }
        }
        if(ygbh_value.equals("")) {
            writeLog("SAP用户登录ID为空");
            return SUCCESS;
        }
        String hrmid = getHrmId(ygbh_value);
        String depid = getDepartmentId(ygbh_value);
        String reqid = request.getRequestid();
        RecordSet rs = new RecordSet();
        String updateSQL = "update formtable_main_767 set sqr = '"+hrmid+"', sqrbm = '"+depid+"' where requestid = '"+reqid+"'";
        writeLog("更新人员ID，部门ID SQL：" +updateSQL);
        rs.execute(updateSQL);
        return SUCCESS;
    }

    /**
     * 根据员工编号获取人员ID
     *
     * @param workcode
     * @return
     */
    public String getHrmId(String workcode) {
        RecordSet rs = new RecordSet();
        String sql = "select id from hrmresource where workcode = '"+workcode+"'";
        writeLog("获取名称："+ sql);
        rs.execute(sql);
        rs.next();
        String id = Util.null2o(rs.getString("id"));
        return id;
    }

    /**
     * 根据人员编号获取对应部门ID
     *
     * @param workcode
     * @return
     */
    public String getDepartmentId(String workcode) {
        RecordSet rs = new RecordSet();
        String sql = "select id from hrmresource where workcode = '"+workcode+"'";
        writeLog("获取ID："+ sql);
        rs.execute(sql);
        rs.next();
        String id = Util.null2o(rs.getString("id"));
        try {
            return new ResourceComInfo().getDepartmentID(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
