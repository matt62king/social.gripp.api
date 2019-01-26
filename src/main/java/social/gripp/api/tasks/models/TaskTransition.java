package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskTransition implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private String workflowId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskTransition that = (TaskTransition) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        return workflowId != null ? workflowId.equals(that.workflowId) : that.workflowId == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (workflowId != null ? workflowId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskTransition{" +
                "taskId='" + taskId + '\'' +
                ", workflowId='" + workflowId + '\'' +
                '}';
    }
}
