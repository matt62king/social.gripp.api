package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskLinker  implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String taskId;
    private String linkedTo;
    private TaskLinkerType taskLinkerType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getLinkedTo() {
        return linkedTo;
    }

    public void setLinkedTo(String linkedTo) {
        this.linkedTo = linkedTo;
    }

    public TaskLinkerType getTaskLinkerType() {
        return taskLinkerType;
    }

    public void setTaskLinkerType(TaskLinkerType taskLinkerType) {
        this.taskLinkerType = taskLinkerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskLinker that = (TaskLinker) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (linkedTo != null ? !linkedTo.equals(that.linkedTo) : that.linkedTo != null) return false;
        return taskLinkerType == that.taskLinkerType;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (linkedTo != null ? linkedTo.hashCode() : 0);
        result = 31 * result + (taskLinkerType != null ? taskLinkerType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskLinker{" +
                "id='" + id + '\'' +
                ", taskId='" + taskId + '\'' +
                ", linkedTo='" + linkedTo + '\'' +
                ", taskLinkerType=" + taskLinkerType +
                '}';
    }
}
