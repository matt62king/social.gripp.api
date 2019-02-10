package social.gripp.api.tasks.models;

import social.gripp.api.projects.models.ProjectLabel;

import java.io.Serializable;
import java.util.List;

public class TaskLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private List<ProjectLabel> labels;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public List<ProjectLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<ProjectLabel> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskLabel taskLabel = (TaskLabel) o;

        if (taskId != null ? !taskId.equals(taskLabel.taskId) : taskLabel.taskId != null) return false;
        return labels != null ? labels.equals(taskLabel.labels) : taskLabel.labels == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (labels != null ? labels.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskLabel{" +
                "taskId='" + taskId + '\'' +
                ", labels=" + labels +
                '}';
    }
}
