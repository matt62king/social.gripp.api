package social.gripp.api.tasks.models;

import java.io.Serializable;
import java.util.List;

public class TaskLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private List<String> addingLabels;
    private List<String> removingLabels;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public List<String> getAddingLabels() {
        return addingLabels;
    }

    public void setAddingLabels(List<String> addingLabels) {
        this.addingLabels = addingLabels;
    }

    public List<String> getRemovingLabels() {
        return removingLabels;
    }

    public void setRemovingLabels(List<String> removingLabels) {
        this.removingLabels = removingLabels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskLabel taskLabel = (TaskLabel) o;

        if (taskId != null ? !taskId.equals(taskLabel.taskId) : taskLabel.taskId != null) return false;
        if (addingLabels != null ? !addingLabels.equals(taskLabel.addingLabels) : taskLabel.addingLabels != null)
            return false;
        return removingLabels != null ? removingLabels.equals(taskLabel.removingLabels) : taskLabel.removingLabels == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (addingLabels != null ? addingLabels.hashCode() : 0);
        result = 31 * result + (removingLabels != null ? removingLabels.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskLabel{" +
                "taskId='" + taskId + '\'' +
                ", addingLabels=" + addingLabels +
                ", removingLabels=" + removingLabels +
                '}';
    }
}
