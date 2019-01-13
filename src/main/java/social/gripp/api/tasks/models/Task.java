package social.gripp.api.tasks.models;

import java.io.Serializable;

public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String projectId;
    private String workflowId;
    private String sprintId;
    private String boardId;
    private String branchId;
    private String repoId;
    private String superId;
    private String title;
    private String description;
    private String testingNotes;
    private String taskId;
    private String createdBy;
    private String assignedTo;
    private Integer points;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public String getSuperId() {
        return superId;
    }

    public void setSuperId(String superId) {
        this.superId = superId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTestingNotes() {
        return testingNotes;
    }

    public void setTestingNotes(String testingNotes) {
        this.testingNotes = testingNotes;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
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

        Task task = (Task) o;

        if (id != null ? !id.equals(task.id) : task.id != null) return false;
        if (projectId != null ? !projectId.equals(task.projectId) : task.projectId != null) return false;
        if (workflowId != null ? !workflowId.equals(task.workflowId) : task.workflowId != null) return false;
        if (sprintId != null ? !sprintId.equals(task.sprintId) : task.sprintId != null) return false;
        if (boardId != null ? !boardId.equals(task.boardId) : task.boardId != null) return false;
        if (branchId != null ? !branchId.equals(task.branchId) : task.branchId != null) return false;
        if (repoId != null ? !repoId.equals(task.repoId) : task.repoId != null) return false;
        if (superId != null ? !superId.equals(task.superId) : task.superId != null) return false;
        if (title != null ? !title.equals(task.title) : task.title != null) return false;
        if (description != null ? !description.equals(task.description) : task.description != null) return false;
        if (testingNotes != null ? !testingNotes.equals(task.testingNotes) : task.testingNotes != null) return false;
        if (taskId != null ? !taskId.equals(task.taskId) : task.taskId != null) return false;
        if (createdBy != null ? !createdBy.equals(task.createdBy) : task.createdBy != null) return false;
        if (assignedTo != null ? !assignedTo.equals(task.assignedTo) : task.assignedTo != null) return false;
        return points != null ? points.equals(task.points) : task.points == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (workflowId != null ? workflowId.hashCode() : 0);
        result = 31 * result + (sprintId != null ? sprintId.hashCode() : 0);
        result = 31 * result + (boardId != null ? boardId.hashCode() : 0);
        result = 31 * result + (branchId != null ? branchId.hashCode() : 0);
        result = 31 * result + (repoId != null ? repoId.hashCode() : 0);
        result = 31 * result + (superId != null ? superId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (testingNotes != null ? testingNotes.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (assignedTo != null ? assignedTo.hashCode() : 0);
        result = 31 * result + (points != null ? points.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", projectId='" + projectId + '\'' +
                ", workflowId='" + workflowId + '\'' +
                ", sprintId='" + sprintId + '\'' +
                ", boardId='" + boardId + '\'' +
                ", branchId='" + branchId + '\'' +
                ", repoId='" + repoId + '\'' +
                ", superId='" + superId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", testingNotes='" + testingNotes + '\'' +
                ", taskId='" + taskId + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", points=" + points +
                '}';
    }
}
