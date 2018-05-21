package weaver.interfaces.gx.jyl.mdm.base;

import java.util.ArrayList;
import java.util.List;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.interfaces.gx.jyl.mdm.base.ReturnModel;

public class ReceiveCodeServiceImpl extends BaseBean implements ReceiveCodeService {

    /**
     * 处理MDM生成的编号
     */
    public ReturnModel updateCodeByApplyNumber(String applyNumber,String code, String flag) {
        ReturnModel model = new ReturnModel();
        RecordSet rs = new RecordSet();
        writeLog("开始处理************************");
        writeLog("申请单号："+ applyNumber);
        writeLog("编码："+ code);
        if(null == applyNumber || "".equalsIgnoreCase(applyNumber.trim())) {
            model.setMessage("申请单号不能为空.");
            model.setStatus("false");
            return model;
        }
        if(null == flag || "".equalsIgnoreCase(flag.trim()) || !contains(flag)){
            model.setMessage("flag："+flag+" 不是有效的字符串，供应商：GYS；客户：KH；人员：RY；物料：WL");
            model.setStatus("false");
            return model;
        }
        String tablename = getPropValue("MDM", "MDM_"+flag+"_TABLE");
        String khbh_column = getPropValue("MDM", "MDM_"+flag+"_BH");
        String sqdh_column = getPropValue("MDM", "MDM_"+flag+"_SQDH");
        code = trunsform(code);
        writeLog("处理过后的编码："+ code);
        String sql = "update " + tablename + " set " + khbh_column + " = '" + code + "' where " + sqdh_column + " = '" + applyNumber + "' ";
        writeLog("SQL：" + sql);
        boolean issuccess = rs.execute(sql);
        if(issuccess) {
            model.setMessage("更新成功.");
            model.setStatus("true");
        } else {
            model.setMessage("更新失败.");
            model.setStatus("false");
        }
        writeLog("结束处理************************");
        return model;
    }
    
    /**
     * 转换特殊字符
     * @param str
     * @return
     */
    private String trunsform(String str) {
        if(str.contains("'")){
            str = str.replaceAll("'", "''");
        }
        if(str.contains("\\")){
            str = str.replaceAll("\\", "\\\\");
        }
        return str;
    }
    
    /**
     * 判断是否包含有效字符串
     * 
     * @param str
     * @return
     */
    private boolean contains(String str) {
       List<String> list = new ArrayList<String>(); 
       list.add("GYS");
       list.add("KH");
       list.add("RY");
       list.add("WL");
       if(list.contains(str)){
           return true;
       }
       return false;
    }
}
