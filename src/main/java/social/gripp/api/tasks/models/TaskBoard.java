package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskBoard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String taskId;
    private String boardId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskBoard taskBoard = (TaskBoard) o;

        if (taskId != null ? !taskId.equals(taskBoard.taskId) : taskBoard.taskId != null) return false;
        return boardId != null ? boardId.equals(taskBoard.boardId) : taskBoard.boardId == null;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (boardId != null ? boardId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskBoard{" +
                "taskId='" + taskId + '\'' +
                ", boardId='" + boardId + '\'' +
                '}';
    }
}
