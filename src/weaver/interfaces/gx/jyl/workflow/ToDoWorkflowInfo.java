package weaver.interfaces.gx.jyl.workflow;

import weaver.general.BaseBean;

import java.util.List;

public class ToDoWorkflowInfo extends BaseBean {

    /**
     * message :
     * data : [{"requestname":"","currentnode":"","currentoperator":"","type":"","receivedate":""}]
     */

    private String message;
    private List<DataBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * url:
         * requestname :
         * currentnode :
         * currentoperator :
         * type :
         * receivedate :
         */

        private String url;
        private String requestname;
        private String currentnode;
        private String currentoperator;
        private String type;
        private String receivedate;
        private String viewtype;

        public String getViewtype() {
            return viewtype;
        }

        public void setViewtype(String viewtype) {
            this.viewtype = viewtype;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getRequestname() {
            return requestname;
        }

        public void setRequestname(String requestname) {
            this.requestname = requestname;
        }

        public String getCurrentnode() {
            return currentnode;
        }

        public void setCurrentnode(String currentnode) {
            this.currentnode = currentnode;
        }

        public String getCurrentoperator() {
            return currentoperator;
        }

        public void setCurrentoperator(String currentoperator) {
            this.currentoperator = currentoperator;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getReceivedate() {
            return receivedate;
        }

        public void setReceivedate(String receivedate) {
            this.receivedate = receivedate;
        }
    }
}
