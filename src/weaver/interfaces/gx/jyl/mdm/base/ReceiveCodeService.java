package weaver.interfaces.gx.jyl.mdm.base;

import weaver.interfaces.gx.jyl.mdm.base.ReturnModel;

public interface ReceiveCodeService {

    /**
     * 接收MDM生成的主数据编码
     * 
     * @param applyNumber 生成主数据的申请号码
     * @param code 返回到OA的主数据编号
     * @param flag 返回到OA的固定字符串：<br>
     * 1. 供应商：GYS <br>
     * 2. 客户：KH <br>
     * 3. 人员：RY <br>
     * 4. 物料：WL <br>
     * @return <br>
     * 1. 返回状态 status：true（成功）,false（失败）<br>
     * 2. 返回消息message
     */
    public ReturnModel updateCodeByApplyNumber(String applyNumber,String code,String flag);
}
