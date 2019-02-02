package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskTestingNotes implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private String testingNotes;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTestingNotes() {
        return testingNotes;
    }

    public void setTestingNotes(String testingNotes) {
        this.testingNotes = testingNotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskTestingNotes that = (TaskTestingNotes) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        return testingNotes != null ? testingNotes.equals(that.testingNotes) : that.testingNotes == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (testingNotes != null ? testingNotes.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskTestingNotes{" +
                "taskId='" + taskId + '\'' +
                ", testingNotes='" + testingNotes + '\'' +
                '}';
    }
}
