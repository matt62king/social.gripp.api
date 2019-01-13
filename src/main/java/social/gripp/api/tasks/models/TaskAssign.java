package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskAssign implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private String assignTo;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(String assignTo) {
        this.assignTo = assignTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskAssign that = (TaskAssign) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        return assignTo != null ? assignTo.equals(that.assignTo) : that.assignTo == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (assignTo != null ? assignTo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskAssign{" +
                "taskId='" + taskId + '\'' +
                ", assignTo='" + assignTo + '\'' +
                '}';
    }
}
