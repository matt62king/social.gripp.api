package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskPoints implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private Integer points;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskPoints that = (TaskPoints) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        return points != null ? points.equals(that.points) : that.points == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (points != null ? points.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskPoints{" +
                "taskId='" + taskId + '\'' +
                ", points=" + points +
                '}';
    }
}
