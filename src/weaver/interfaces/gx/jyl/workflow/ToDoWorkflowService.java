package weaver.interfaces.gx.jyl.workflow;

public interface ToDoWorkflowService {
    public String toDoWorkflow(String loginid, String token);
    public String toDoWorkflowCount(String loginid, String token);
    public String ybWorkflow(String loginid, String token);
    public String bjWorkflow(String loginid, String token);
    public String csWorkflow(String loginid, String token);
    public String myWorkflow(String loginid, String token);
}
