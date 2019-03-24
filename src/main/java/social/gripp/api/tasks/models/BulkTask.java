package social.gripp.api.tasks.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class BulkTask implements Serializable {

    private static final long serialVersionUID = 1L;

    private Task task;
    private List<String> projectLabels;
    private List<TaskLinker> taskLinkers;

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

    public List<TaskLinker> getTaskLinkers() {
        return taskLinkers;
    }

    public void setTaskLinkers(List<TaskLinker> taskLinkers) {
        this.taskLinkers = taskLinkers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BulkTask bulkTask = (BulkTask) o;
        return Objects.equals(task, bulkTask.task) &&
                Objects.equals(projectLabels, bulkTask.projectLabels) &&
                Objects.equals(taskLinkers, bulkTask.taskLinkers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, projectLabels, taskLinkers);
    }

    @Override
    public String toString() {
        return "BulkTask{" +
                "task=" + task +
                ", projectLabels=" + projectLabels +
                ", taskLinkers=" + taskLinkers +
                '}';
    }
}
