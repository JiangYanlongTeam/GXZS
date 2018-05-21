package weaver.interfaces.gx.jyl.tyfybx;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;

/**
 * 通用费用报销： 退回将在途借款金额释放
 */
public class TYFYBXTHAction extends BaseBean implements Action {

	public String execute(RequestInfo request) {
		//报销方式-值
        String bxfs_value = "";
        //是否冲销借款-字段
        String bxfs_column = "bxfs";
		//冲销金额-值
        String cxje_value = "";
        //冲销金额-字段
        String cxje_column = "cxje";
		//还款金额-值
        String hkje_value = "";
        //还款金额-字段
        String hkje_column = "hkje";
		//借款单号-值
        String jkdh_value = "";
        //借款单号-字段
        String jkdh_column = "jkdh";
		//冲预付款金额-值
        String czje_value = "";
        //冲预付款金额-字段
        String czje_column = "czje";
		//资金划拨单号-值
        String zjhbdh_value = "";
        //资金划拨单号-字段
        String zjhbdh_column = "zjhbdh";
        
        RecordSet rs = new RecordSet();
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(bxfs_column)) {
            	bxfs_value = value;
            }
        }
        DetailTable[] detailtable = request.getDetailTableInfo().getDetailTable();// 获取所有明细表
        DetailTable dt = detailtable[3];// 指定明细表 0表示明细表1
        Row[] s1 = dt.getRow();// 当前明细表的所有数据,按行存储
        for (int j = 0; j < s1.length; j++) {
            Row r = s1[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (cxje_column.equals(name)) {
                	cxje_value = value;
                }
                if (hkje_column.equals(name)) {
                	hkje_value = value;
                }
                if (hkje_column.equals(name)) {
                	hkje_value = value;
                }
                if (jkdh_column.equals(name)) {
                	jkdh_value = value;
                }
            }
        }
        
        DetailTable dt1 = detailtable[3];// 指定明细表 0表示明细表1
        Row[] s2 = dt1.getRow();// 当前明细表的所有数据,按行存储
        for (int j = 0; j < s2.length; j++) {
            Row r = s2[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (czje_column.equals(name)) {
                	czje_value = value;
                }
                if (czje_column.equals(name)) {
                	czje_value = value;
                }
                if (zjhbdh_column.equals(name)) {
                	zjhbdh_value = value;
                }
            }
        }
        
        
        writeLog("报销方式："+ bxfs_value);
        writeLog("冲销金额："+ cxje_value);
        writeLog("还款金额："+ hkje_value);
        writeLog("借款单号："+ jkdh_value);
        writeLog("冲预付款金额："+ czje_value);
        writeLog("资金划拨单号："+ zjhbdh_value);
        
        double dou = Util.getDoubleValue(cxje_value,0);
        double dou1 = Util.getDoubleValue(hkje_value,0);
        double dou2 = Util.getDoubleValue(czje_value,0);
        double total = dou + dou1;
        writeLog("退回将在途借款金额释放 总金额："+ total);
        if("0".equals(bxfs_value)) {
        	String tablename = getPropValue("GXBX", "CW_FYJK");
        	String sql = "update "+tablename+" set hkztje=hkztje-'"+total+"' where id='"+jkdh_value+"'  ";
        	writeLog("退回将在途借款金额释放: " + sql);
        	rs.execute(sql);
        }
        if("1".equals(bxfs_value)) {
        	String tablename = getPropValue("GXBX", "CW_YFKB");
        	String sql = "update "+tablename+" set ztcyfk=ztcyfk-'"+dou2+"' where id='"+zjhbdh_value+"'  ";
        	writeLog("提交将冲预付款金额变为在途: " + sql);
        	rs.execute(sql);
        }
		return SUCCESS;
	}
	
}
