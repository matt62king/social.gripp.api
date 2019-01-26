package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskSprint implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private String sprintId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskSprint that = (TaskSprint) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        return sprintId != null ? sprintId.equals(that.sprintId) : that.sprintId == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (sprintId != null ? sprintId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskSprint{" +
                "taskId='" + taskId + '\'' +
                ", sprintId='" + sprintId + '\'' +
                '}';
    }
}
