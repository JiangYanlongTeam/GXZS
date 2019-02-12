package weaver.interfaces.gx.jyl;

import weaver.conn.RecordSet;
import weaver.general.StaticObj;
import weaver.general.Util;
import weaver.hrm.User;
import weaver.hrm.company.SubCompanyComInfo;
import weaver.interfaces.workflow.browser.BaseBrowser;
import weaver.interfaces.workflow.browser.Browser;
import weaver.workflow.webservices.WorkflowService;
import weaver.workflow.webservices.WorkflowServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {



    public List<Map<String, String>> test(User user, Map<String, String> otherparams, HttpServletRequest request, HttpServletResponse response) {
        List<Map<String, String>> data = new ArrayList<Map<String, String>>();

        RecordSet recordSet = new RecordSet();
        recordSet.execute("select * from hrmresource where ID = 18327");

        while (recordSet.next()) {
            String id = Util.null2String(recordSet.getString("id"));
            String name = Util.null2String(recordSet.getString("lastname"));
            String password = Util.null2String(recordSet.getString("password"));
            Map<String, String> ob = new HashMap<String, String>();

            ob.put("id", id);
            ob.put("name", name);
            ob.put("password", password);

            String jsondata = Util.spacetoHtml(id + ";" + name + ";" + password);
            ob.put("jsondata", jsondata);
            data.add(ob);
        }

        return data;
    }

    public static void main(String[] args) {
        BaseBrowser browser = new BaseBrowser();
        browser.search("","",null);
        StaticObj.getServiceByFullname("browser.cs_wbs", Browser.class);



    }

}
