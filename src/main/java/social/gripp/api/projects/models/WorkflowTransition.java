package social.gripp.api.projects.models;

import java.io.Serializable;

public class WorkflowTransition implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String projectId;
    private String toWorkflowId;
    private BranchAction branchAction;

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

    public String getToWorkflowId() {
        return toWorkflowId;
    }

    public void setToWorkflowId(String toWorkflowId) {
        this.toWorkflowId = toWorkflowId;
    }

    public BranchAction getBranchAction() {
        return branchAction;
    }

    public void setBranchAction(BranchAction branchAction) {
        this.branchAction = branchAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowTransition that = (WorkflowTransition) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (toWorkflowId != null ? !toWorkflowId.equals(that.toWorkflowId) : that.toWorkflowId != null) return false;
        return branchAction == that.branchAction;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (toWorkflowId != null ? toWorkflowId.hashCode() : 0);
        result = 31 * result + (branchAction != null ? branchAction.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WorkflowTransition{" +
                "id='" + id + '\'' +
                ", projectId='" + projectId + '\'' +
                ", toWorkflowId='" + toWorkflowId + '\'' +
                ", branchAction=" + branchAction +
                '}';
    }
}
