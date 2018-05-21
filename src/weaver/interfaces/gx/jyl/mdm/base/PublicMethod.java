package weaver.interfaces.gx.jyl.mdm.base;

import java.util.ArrayList;
import java.util.List;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 公共方法<br>
 * 1. 根据人事范围（流程中公司代码）获取分发系统<br>
 * 2. 设置流程错误信息
 */
public class PublicMethod extends BaseBean {

    /**
     * 根据人事范围（流程中公司代码）获取分发系统
     * 
     * @param gsdm 公司代码
     * @param zsjxm 主数据项目
     * @return
     */
    public List<FFXTMode> getFFXT(String gsdm,String zsjxm) {
        String sql = "select ffxtmc,ffxtdm from uf_bkffxt where ssbk = (select ssbk from uf_rsbkgx where zt = '0' and rsfwdm = '"+gsdm+"') and zt = '0' and zsjxm = '"+zsjxm+"'";
        log("根据人事范围（流程中公司代码）获取分发系统SQL：" + sql);
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        List<FFXTMode> list = new ArrayList<FFXTMode>();
        while(rs.next()) {
            FFXTMode mode = new FFXTMode();
            String ffxtmc = Util.null2o(rs.getString("ffxtmc"));
            String ffxtdm = Util.null2o(rs.getString("ffxtdm"));
            mode.setFfxtdm(ffxtdm);
            mode.setFfxtmc(ffxtmc);
            list.add(mode);
        }
        return list;
    }
    
    /**
     * 设置流程错误信息
     * 
     * @param request
     * @param messageid
     * @param messagecontent
     */
    public void setFailedMessage(RequestInfo request,String messageid,String messagecontent){
        request.getRequestManager().setMessageid(messageid);
        request.getRequestManager().setMessagecontent(messagecontent);
    }
    
    /**
     * 打印日志
     * @param o
     */
    public void log(Object o) {
        writeLog(o);
    }
    
    /**
     * 根据账号类型code查询中文显示名字 TODO
     * 
     * @param yzcode
     * @return
     */
    public String getKhlxChineseName(String mycode) {
        String sql = "select mc from uf_khlx where zt='0' and dm = '"+mycode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("mc"));
        return gj_name;
    }
    
    /**
     * 根据贸易伙伴code查询中文显示名字 TODO
     * 
     * @param yzcode
     * @return
     */
    public String getMyhbChineseName(String mycode) {
        String sql = "select mc from uf_myhb where zt='0' and dm = '"+mycode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("mc"));
        return gj_name;
    }
    
    /**
     * 根据语种code查询中文显示名字
     * 
     * @param yzcode
     * @return
     */
    public String getYzChineseName(String yzcode) {
        String sql = "select mc from uf_yzmc where zt='0' and dm = '"+yzcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("mc"));
        return gj_name;
    }
    
    /**
     * 根据地区code查询中文显示名字
     * 
     * @param regioncode
     * @return
     */
    public String getResionChineseName(String regioncode) {
        String sql = "select dqmc from uf_dq where zt='0' and dqdm = '"+regioncode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("dqmc"));
        return gj_name;
    }
    
    /**
     * 根据国家code查询中文显示名字
     * 
     * @param gjcode
     * @return
     */
    public String getGjChineseName(String gjcode) {
        String sql = "select mc from uf_gj where dm = '"+gjcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String gj_name = Util.null2o(rs.getString("mc"));
        return gj_name;
    }
    
    /**
     * 根据账户组code查询中文显示名字
     * 
     * @param zhzcode
     * @return
     */
    public String getZHZChineseName(String zhzcode) {
        String sql = "select mc from uf_khzhz where zt='0' and dm = '"+zhzcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String zhz_name = Util.null2o(rs.getString("mc"));
        return zhz_name;
    }
    
    /**
     * 根据称谓code查询中文显示名字
     * 
     * @param cwcode
     * @return
     */
    public String getCWChineseName(String cwcode) {
        String sql = "select mc from uf_cw where zt='0' and dm = '"+cwcode+"'";
        RecordSet rs = new RecordSet();
        rs.execute(sql);
        rs.next();
        String cw_name = Util.null2o(rs.getString("mc"));
        return cw_name;
    }
    
}
