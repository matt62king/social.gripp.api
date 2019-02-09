package social.gripp.api.tasks.models;

import java.io.Serializable;

public class TaskBranch implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String taskId;
    private String repoId;
    private String branchName;
    private String branchSha;

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

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchSha() {
        return branchSha;
    }

    public void setBranchSha(String branchSha) {
        this.branchSha = branchSha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskBranch that = (TaskBranch) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (repoId != null ? !repoId.equals(that.repoId) : that.repoId != null) return false;
        if (branchName != null ? !branchName.equals(that.branchName) : that.branchName != null) return false;
        return branchSha != null ? branchSha.equals(that.branchSha) : that.branchSha == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (repoId != null ? repoId.hashCode() : 0);
        result = 31 * result + (branchName != null ? branchName.hashCode() : 0);
        result = 31 * result + (branchSha != null ? branchSha.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaskBranch{" +
                "id='" + id + '\'' +
                ", taskId='" + taskId + '\'' +
                ", repoId='" + repoId + '\'' +
                ", branchName='" + branchName + '\'' +
                ", branchSha='" + branchSha + '\'' +
                '}';
    }
}
