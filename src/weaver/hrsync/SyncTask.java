package weaver.hrsync;

import weaver.conn.RecordSet;
import weaver.conn.RecordSetDataSource;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.job.JobTitlesComInfo;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.schedule.BaseCronJob;

public class SyncTask extends BaseCronJob {

    public BaseBean baseBean = new BaseBean();

    @Override
    public void execute() {
        writeLog("即将同步岗位..");
        syncJobtitles("");
        writeLog("同步岗位完成..");
        writeLog("即将同步人员..");
        syncHrmresurce("");
        writeLog("同步人员完成..");
    }

    public void syncJobtitles(String id) {
        RecordSet rsdep = new RecordSet();
        RecordSetDataSource recordSetDataSource = new RecordSetDataSource("hrsync");
        RecordSetDataSource recordSetDataSource2 = new RecordSetDataSource("hrsync");
        String sql1 = "select id,SHORTNAME,NAME,COMPANYCODE,DEPTCODE,JOBCODE  from uf_exjobtitles where 1=1  ";
        if (!"".equals(Util.null2String(id))) {
            sql1 += " and id = '" + id + "' ";
        } else {
            sql1 += " and flag = 'I' or flag = 'U' ";
        }
        sql1 += " group by id,SHORTNAME,NAME,COMPANYCODE,DEPTCODE,JOBCODE order by id ";
        recordSetDataSource.execute(sql1);
        while (recordSetDataSource.next()) {
            String returninfo = "success";
            String jobtitlemark = Util.null2String(recordSetDataSource.getString("shortname"));// 职位简称
            String syncid = Util.null2String(recordSetDataSource.getString("id"));// id
            String jobtitlename = Util.null2String(recordSetDataSource.getString("name"));// 职位全称
            String jobtitleremark = Util.null2String(recordSetDataSource.getString("companycode"));// 所属公司编码
            String deptcode = Util.null2String(recordSetDataSource.getString("deptcode"));// 所属部门编码
            String jobcode = Util.null2String(recordSetDataSource.getString("jobcode"));// 职位编码
            String departmengSql = "select * from hrmdepartment where departmentcode='" + deptcode + "'";
            rsdep.execute(departmengSql);
            String jobdepartmentid = "";// 所属部门ID
            while (rsdep.next()) {
                jobdepartmentid = Util.null2String(rsdep.getString("id"));
            }
            if ("".equals(jobdepartmentid)) {
                writeLog("更新岗位时部门编码" + deptcode + " 在oa中不存在");
                String updatesylsql = "update UF_EXJOBTITLES set returninfo = '更新岗位时部门编码" + deptcode + " 在oa中不存在' where id='" + syncid + "'";
                recordSetDataSource2.execute(updatesylsql);
                continue;
            }
            String companySql = "select * from hrmdepartment where departmentcode='" + deptcode + "'";
            rsdep.execute(companySql);
            String companyid = "";// 所属公司ID
            while (rsdep.next()) {
                companyid = Util.null2String(rsdep.getString("subcompanyid1"));
            }

            if (checkJobExists(jobcode)) {
                StringBuffer updatesql = new StringBuffer(
                        "update HrmJobTitles set jobtitlemark='" + jobtitlemark
                                + "',");
                updatesql.append("jobtitlename='" + jobtitlename
                        + "',jobtitleremark='" + companyid
                        + "',jobdepartmentid='" + jobdepartmentid + "'");
                updatesql.append(" where jobtitlecode='" + jobcode + "'");
                writeLog("更新职位数据" + updatesql.toString());
                rsdep.execute(updatesql.toString());
                try {
                    JobTitlesComInfo jobTitlesComInfo = new JobTitlesComInfo();
                    jobTitlesComInfo.removeJobTitlesCache();
                    writeLog("更新岗位缓存成功");
                } catch (Exception e) {
                    e.printStackTrace();
                    writeLog("更新岗位缓存失败");
                }
            } else {
                StringBuffer insertsql = new StringBuffer(
                        "insert into HrmJobTitles(jobtitlecode,jobtitlemark,jobtitlename,jobtitleremark,jobdepartmentid)");
                insertsql.append("values('" + jobcode + "','" + jobtitlemark
                        + "','" + jobtitlename + "','" + companyid + "','"
                        + jobdepartmentid + "')");
                writeLog("插入职位数据" + insertsql.toString());
                rsdep.execute(insertsql.toString());
                try {
                    JobTitlesComInfo jobTitlesComInfo = new JobTitlesComInfo();
                    jobTitlesComInfo.removeJobTitlesCache();
                    writeLog("更新岗位缓存成功");
                } catch (Exception e) {
                    e.printStackTrace();
                    writeLog("更新岗位缓存失败");
                }
            }
            String updatesylsql = "update uf_exjobtitles set flag=0 ,returninfo = '操作成功' where id='" + syncid + "'";
            recordSetDataSource2.execute(updatesylsql);
        }
    }

    public void syncHrmresurce(String id) {
        RecordSet rsdep = new RecordSet();
        RecordSetDataSource recordSetDataSource = new RecordSetDataSource("hrsync");
        RecordSetDataSource recordSetDataSource2 = new RecordSetDataSource("hrsync");
        String sql1 = "select id,hrmno,NAME,SEX,BIRTHDAY,MOBILE,EMAIL,folk,NATIVEPLACE,MARITALSTATUS,POLICY,EDUCATIONLEVEL,JOBCODE,DEPARTMENTCODE,SUBCOMCODE,CERTIFICATENUM " +
                ",STATUS,CBZX from UF_EXPERSON where 1=1  ";
        if (!"".equals(Util.null2String(id))) {
            sql1 += " and id = '" + id + "' ";
        } else {
            sql1 += " and flag = 'I' or flag = 'U' ";
        }
        sql1 += " group by id,hrmno,NAME,SEX,BIRTHDAY,MOBILE,EMAIL,folk,NATIVEPLACE,MARITALSTATUS,POLICY,EDUCATIONLEVEL,JOBCODE,DEPARTMENTCODE,SUBCOMCODE,CERTIFICATENUM" +
                ",STATUS,CBZX order by id ";
        recordSetDataSource.execute(sql1);
        while (recordSetDataSource.next()) {
            String returninfo = "success";
            String insertbz = "hr";
            String password = Util.getEncrypt("jsgx@2012");    //MD5加密密码
            String name = Util.null2String(recordSetDataSource.getString("name"));
            String syncid = Util.null2String(recordSetDataSource.getString("id"));// id
            String sex = Util.null2String(recordSetDataSource.getString("sex"));
            String birthday = Util.null2String(recordSetDataSource.getString("birthday"));
            String mobile = Util.null2String(recordSetDataSource.getString("mobile"));
            String email = Util.null2String(recordSetDataSource.getString("email"));
            String jobcode = Util.null2String(recordSetDataSource.getString("jobcode"));
            String cbzx = Util.null2String(recordSetDataSource.getString("cbzx"));
            String departmentcode = Util.null2String(recordSetDataSource.getString("departmentcode"));
            String subcomcode = Util.null2String(recordSetDataSource.getString("subcomcode"));
            String certificatenum = Util.null2String(recordSetDataSource.getString("certificatenum"));
            String hrmno = Util.null2String(recordSetDataSource.getString("hrmno"));
            String folk = Util.null2String(recordSetDataSource.getString("folk"));
            String nativeplace = Util.null2String(recordSetDataSource.getString("nativeplace"));
            String maritalstatus = Util.null2String(recordSetDataSource.getString("maritalstatus"));
            String policy = Util.null2String(recordSetDataSource.getString("policy"));
            String edulevel = Util.null2String(recordSetDataSource.getString("educationlevel"));
            String status = Util.null2String(recordSetDataSource.getString("status"));
            String flag = Util.null2String(recordSetDataSource.getString("flag"));
            String departmengSql = "select * from hrmdepartment where departmentcode='" + departmentcode + "'";
            rsdep.execute(departmengSql);
            String departmentid = "";
            boolean depflag = false;//判断是否可以同步
            while (rsdep.next()) {//存在部门
                depflag = true;
                departmentid = rsdep.getString("id");
            }
            if (!depflag) {
                returninfo = "同步人员，姓名为" + name + ",身份证号为" + certificatenum + "，对应部门编码" + departmentcode + "在oa中不存在";
                writeLog(returninfo);
                recordSetDataSource2.execute("update UF_EXPERSON set returninfo = '" + returninfo + "' where id = '" + syncid + "'");
                continue;
            }
            String subcomcodeSql = "select * from hrmdepartment where departmentcode='" + departmentcode + "'";
            rsdep.execute(subcomcodeSql);
            String subcompanyid = "";
            while (rsdep.next()) {//存在分部
                subcompanyid = rsdep.getString("subcompanyid1");
            }

            String jobSql = "select * from HrmJobTitles where jobtitlecode='"
                    + jobcode + "'";
            rsdep.execute(jobSql);
            String jobtitle = "";
            boolean jobflag = false;
            while (rsdep.next()) {//存在职位
                jobflag = true;
                jobtitle = Util.null2String(rsdep.getString("id"));
            }
            if (!jobflag) {
                returninfo = "同步人员，姓名为" + name + ",身份证号为" + certificatenum + "，对应岗位编码" + jobcode + "在oa中不存在";
                writeLog(returninfo);
                recordSetDataSource2.execute("update UF_EXPERSON set returninfo = '" + returninfo + "' where id = '" + syncid + "'");
                continue;
            }

            if ("".equals(certificatenum)) {
                returninfo = "姓名" + name + "的身份证号为空";
                writeLog(returninfo);
                recordSetDataSource2.execute("update UF_EXPERSON set returninfo = '" + returninfo + "' where id = '" + syncid + "'");
                continue;
            }

            if (!checkCertificatenum(certificatenum)) {
                rsdep.executeProc("HrmResourceMaxId_Get", "");
                rsdep.next();
                int maxid = rsdep.getInt(1);
                writeLog("获取人员当前最大id："+maxid);

                StringBuffer insertsql = new StringBuffer(
                        "insert into hrmresource(id,lastname,sex,birthday,mobile,");
                insertsql.append("email,departmentid,jobtitle,subcompanyid1,");
                insertsql.append("certificatenum,workcode,folk,nativeplace,maritalstatus,");
                insertsql.append("policy,textfield1,textfield2,educationlevel,Status,");
                insertsql.append("loginid,password,systemlanguage,seclevel,dsporder,textfield3)");
                insertsql.append("values('" + maxid + "','" + name + "','" + sex + "','"
                        + birthday + "','" + mobile + "','" + email + "',");
                insertsql.append("'" + departmentid + "','" + jobtitle + "','"
                        + subcompanyid + "','" + certificatenum + "','" + hrmno + "','" + folk + "',");
                insertsql.append("'" + nativeplace + "','" + maritalstatus + "','" + policy + "','" + subcomcode + "','" + insertbz + "','"
                        + edulevel + "','" + status + "',");
                insertsql.append("'" + certificatenum + "','" + password + "','7','10','" + maxid + "','" + cbzx + "')");
                writeLog("新增人员数据" + insertsql.toString());
                rsdep.execute(insertsql.toString());

                ResourceComInfo resourceComInfo = null;
                try {
                    resourceComInfo = new ResourceComInfo();
                    resourceComInfo.removeResourceCache();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                StringBuffer updatesql = new StringBuffer(
                        "update hrmresource set lastname='" + name + "',");
                updatesql.append("sex='" + sex + "',birthday='" + birthday
                        + "',mobile='" + mobile + "',");
                updatesql.append("email='" + email + "',departmentid='"
                        + departmentid + "',jobtitle='" + jobtitle
                        + "',subcompanyid1='" + subcompanyid + "',");
                updatesql.append("certificatenum='" + certificatenum
                        + "',folk='" + folk + "',nativeplace='" + nativeplace + "',maritalstatus='" + maritalstatus + "',");
                updatesql.append("policy='" + policy + "',textfield1='" + subcomcode + "',textfield3='" + cbzx + "',educationlevel='"
                        + edulevel + "',Status='" + status + "' , workcode  = '" + hrmno + "' ");
                updatesql.append(" where CERTIFICATENUM='" + certificatenum + "'");
                writeLog("更新人员数据" + updatesql.toString());
                rsdep.execute(updatesql.toString());
                ResourceComInfo resourceComInfo = null;
                try {
                    resourceComInfo = new ResourceComInfo();
                    resourceComInfo.removeResourceCache();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            String updatesylsql = "update UF_EXPERSON set flag=0,returninfo = '操作成功' where id='" + syncid + "'";
            recordSetDataSource2.execute(updatesylsql);
            writeLog("更新" + updatesylsql.toString());
        }
    }

    public boolean checkCertificatenum(String workcode) {
        RecordSet rs = new RecordSet();
        String sb = "select * from hrmresource where CERTIFICATENUM = '" + workcode + "' ";
        rs.execute(sb);
        boolean flag = false;
        while (rs.next()) {
            flag = true;
        }
        writeLog("检查人员身份证号码："+workcode + flag);
        return flag;
    }

    public boolean checkJobExists(String jobcode) {
        RecordSet rs = new RecordSet();
        String sb = "select * from HrmJobTitles where jobtitlecode='" + jobcode + "'";
        rs.execute(sb);
        boolean flag = false;
        while (rs.next()) {
            flag = true;
        }
        return flag;
    }

    public void updateHrmCominfo() {
        RecordSet recordSet = new RecordSet();
        try {
            ResourceComInfo resourceComInfo = new ResourceComInfo();
            String getMaxId = "select max(id) maxid from hrmresource ";
            recordSet.execute(getMaxId);
            recordSet.next();
            String maxid = Util.null2o(recordSet.getString("maxid"));
            resourceComInfo.getLastname(maxid);

            resourceComInfo.removeResourceCache();

            writeLog("更新人员缓存成功");
        } catch (Exception e) {
            e.printStackTrace();
            writeLog("更新人员缓存失败");
        }
    }

    public void updateJobTitleCominfo() {
        RecordSet recordSet = new RecordSet();
        try {
            JobTitlesComInfo jobTitlesComInfo = new JobTitlesComInfo();
            String getMaxId = "select max(id) maxid from HrmJobTitles ";
            recordSet.execute(getMaxId);
            recordSet.next();
            String maxid = Util.null2o(recordSet.getString("maxid"));
            jobTitlesComInfo.getJobTitlesname(maxid);
            writeLog("更新岗位缓存成功");
        } catch (Exception e) {
            e.printStackTrace();
            writeLog("更新岗位缓存失败");
        }
    }

    public void writeLog(Object o) {
        baseBean.writeLog(o);
    }
}
