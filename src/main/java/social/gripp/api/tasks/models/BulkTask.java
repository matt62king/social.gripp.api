package social.gripp.api.tasks.models;

import social.gripp.api.projects.models.ProjectLabel;

import java.io.Serializable;
import java.util.List;

public class BulkTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private Task task;
    private List<ProjectLabel> taskLabels;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<ProjectLabel> getTaskLabels() {
        return taskLabels;
    }

    public void setTaskLabels(List<ProjectLabel> taskLabels) {
        this.taskLabels = taskLabels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BulkTask bulkTask = (BulkTask) o;

        if (task != null ? !task.equals(bulkTask.task) : bulkTask.task != null) return false;
        return taskLabels != null ? taskLabels.equals(bulkTask.taskLabels) : bulkTask.taskLabels == null;
    }

    @Override
    public int hashCode() {
        int result = task != null ? task.hashCode() : 0;
        result = 31 * result + (taskLabels != null ? taskLabels.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BulkTask{" +
                "task=" + task +
                ", taskLabels=" + taskLabels +
                '}';
    }
}
