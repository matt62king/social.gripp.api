package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskDescription  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private String description;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskDescription that = (TaskDescription) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        return description != null ? description.equals(that.description) : that.description == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskDescription{" +
                "taskId='" + taskId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
