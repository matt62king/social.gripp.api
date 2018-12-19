package social.gripp.api.projects.models;

import java.io.Serializable;

public class WorkflowPreviousLinker implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String projectWorkflowId;
    private String previousProjectWorkflowId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectWorkflowId() {
        return projectWorkflowId;
    }

    public void setProjectWorkflowId(String projectWorkflowId) {
        this.projectWorkflowId = projectWorkflowId;
    }

    public String getPreviousProjectWorkflowId() {
        return previousProjectWorkflowId;
    }

    public void setPreviousProjectWorkflowId(String previousProjectWorkflowId) {
        this.previousProjectWorkflowId = previousProjectWorkflowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowPreviousLinker that = (WorkflowPreviousLinker) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectWorkflowId != null ? !projectWorkflowId.equals(that.projectWorkflowId) : that.projectWorkflowId != null)
            return false;
        return previousProjectWorkflowId != null ? previousProjectWorkflowId.equals(that.previousProjectWorkflowId) : that.previousProjectWorkflowId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectWorkflowId != null ? projectWorkflowId.hashCode() : 0);
        result = 31 * result + (previousProjectWorkflowId != null ? previousProjectWorkflowId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WorkflowPreviousLinker{" +
                "id='" + id + '\'' +
                ", projectWorkflowId='" + projectWorkflowId + '\'' +
                ", previousProjectWorkflowId='" + previousProjectWorkflowId + '\'' +
                '}';
    }
}
