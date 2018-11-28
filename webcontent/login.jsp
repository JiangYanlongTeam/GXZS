<%@ page import="weaver.conn.RecordSet" %>
<%@ page import="weaver.general.BaseBean" %>
<%@ page import="weaver.general.Util" %>
<%@ page import="weaver.hrm.OnLineMonitor" %>
<%@ page import="weaver.hrm.User" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String xh_ac = Util.null2String(request.getParameter("xh_ac"));
    String xh_token = Util.null2String(request.getParameter("xh_token"));


    String tokenString = new BaseBean().getPropValue("xh_workflow", "token");
    String md5String = Util.getEncrypt(tokenString + xh_ac);

    new BaseBean().writeLog("xh_ac:"+xh_ac);
    new BaseBean().writeLog("xh_token:"+xh_token);
    new BaseBean().writeLog("md5String:"+md5String);

    RecordSet rs = new RecordSet();
    if (xh_token.equals(md5String)) {
        rs.execute("select * from HrmResource where loginid='" + xh_ac + "' and status<=3");

        if (rs.next()) {
            User user = (User) request.getSession(true).getAttribute("weaver_user@bean");
            if (user == null) {
                user = new User();
                user.setUid(rs.getInt("id"));
                user.setLoginid(rs.getString("loginid"));
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
                user.setAliasname(rs.getString("aliasname"));
                user.setTitle(rs.getString("title"));
                user.setTitlelocation(rs.getString("titlelocation"));
                user.setSex(rs.getString("sex"));
                user.setPwd(rs.getString("password"));
                String languageidweaver = rs.getString("systemlanguage");
                user.setLanguage(Util.getIntValue(languageidweaver, 0));

                user.setTelephone(rs.getString("telephone"));
                user.setMobile(rs.getString("mobile"));
                user.setMobilecall(rs.getString("mobilecall"));
                user.setEmail(rs.getString("email"));
                user.setCountryid(rs.getString("countryid"));
                user.setLocationid(rs.getString("locationid"));
                user.setResourcetype(rs.getString("resourcetype"));
                user.setStartdate(rs.getString("startdate"));
                user.setEnddate(rs.getString("enddate"));
                user.setContractdate(rs.getString("contractdate"));
                user.setJobtitle(rs.getString("jobtitle"));
                user.setJobgroup(rs.getString("jobgroup"));
                user.setJobactivity(rs.getString("jobactivity"));
                user.setJoblevel(rs.getString("joblevel"));
                user.setSeclevel(rs.getString("seclevel"));
                user.setUserDepartment(Util.getIntValue(rs.getString("departmentid"), 0));
                user.setUserSubCompany1(Util.getIntValue(rs.getString("subcompanyid1"), 0));
                user.setUserSubCompany2(Util.getIntValue(rs.getString("subcompanyid2"), 0));
                user.setUserSubCompany3(Util.getIntValue(rs.getString("subcompanyid3"), 0));
                user.setUserSubCompany4(Util.getIntValue(rs.getString("subcompanyid4"), 0));
                user.setManagerid(rs.getString("managerid"));
                user.setAssistantid(rs.getString("assistantid"));
                user.setPurchaselimit(rs.getString("purchaselimit"));
                user.setCurrencyid(rs.getString("currencyid"));
                user.setLastlogindate(rs.getString("currentdate"));
                user.setLogintype("1");
                user.setAccount(rs.getString("account"));

                user.setLoginip(request.getRemoteAddr());
                request.getSession(true).setMaxInactiveInterval(60 * 60 * 24);
                request.getSession(true).setAttribute("weaver_user@bean", user);
                request.getSession(true).setAttribute("moniter", new OnLineMonitor("" + user.getUID(), user.getLoginip()));
                Util.setCookie(response, "loginfileweaver", "/wui/theme/ecology8/page/login.jsp?templateId=3&logintype=1&gopage=", 172800);
                Util.setCookie(response, "loginidweaver", "" + user.getUID(), 172800);
                Util.setCookie(response, "languageidweaver", languageidweaver, 172800);
                //用户的登录后的页面
                weaver.systeminfo.template.UserTemplate ut = new weaver.systeminfo.template.UserTemplate();
                ut.getTemplateByUID(user.getUID(), user.getUserSubCompany1());
                int templateId = ut.getTemplateId();
                int extendTempletid = ut.getExtendtempletid();
                int extendtempletvalueid = ut.getExtendtempletvalueid();
                String defaultHp = ut.getDefaultHp();
                session.setAttribute("defaultHp", defaultHp);

                Map logmessages = (Map) application.getAttribute("logmessages");
                if (logmessages == null) {
                    logmessages = new HashMap();
                    logmessages.put("" + user.getUID(), "");
                    application.setAttribute("logmessages", logmessages);
                }
                session.setAttribute("logmessage", "");
                response.sendRedirect("/wui/main.jsp");
                return;
            } else {
                response.sendRedirect("/wui/main.jsp");
            }
        } else {
            out.println("token不合法");
            return;
        }
    }
%>