package social.gripp.api.tasks.models;

import java.io.Serializable;
import java.util.List;

public class BulkTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private Task task;
    private List<String> projectLabels;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<String> getProjectLabels() {
        return projectLabels;
    }

    public void setProjectLabels(List<String> projectLabels) {
        this.projectLabels = projectLabels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BulkTask bulkTask = (BulkTask) o;

        if (task != null ? !task.equals(bulkTask.task) : bulkTask.task != null) return false;
        return projectLabels != null ? projectLabels.equals(bulkTask.projectLabels) : bulkTask.projectLabels == null;
    }

    @Override
    public int hashCode() {
        int result = task != null ? task.hashCode() : 0;
        result = 31 * result + (projectLabels != null ? projectLabels.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BulkTask{" +
                "task=" + task +
                ", projectLabels=" + projectLabels +
                '}';
    }
}
