package social.gripp.api.projects.models;

import java.io.Serializable;

public class WorkflowNextLinker implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String projectWorkflowId;
    private String nextProjectWorkflowId;

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

    public String getNextProjectWorkflowId() {
        return nextProjectWorkflowId;
    }

    public void setNextProjectWorkflowId(String nextProjectWorkflowId) {
        this.nextProjectWorkflowId = nextProjectWorkflowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowNextLinker that = (WorkflowNextLinker) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectWorkflowId != null ? !projectWorkflowId.equals(that.projectWorkflowId) : that.projectWorkflowId != null)
            return false;
        return nextProjectWorkflowId != null ? nextProjectWorkflowId.equals(that.nextProjectWorkflowId) : that.nextProjectWorkflowId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectWorkflowId != null ? projectWorkflowId.hashCode() : 0);
        result = 31 * result + (nextProjectWorkflowId != null ? nextProjectWorkflowId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WorkflowNextLinker{" +
                "id='" + id + '\'' +
                ", projectWorkflowId='" + projectWorkflowId + '\'' +
                ", nextProjectWorkflowId='" + nextProjectWorkflowId + '\'' +
                '}';
    }
}
