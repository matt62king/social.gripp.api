package social.gripp.api.projects.models;

import java.io.Serializable;

public class WorkflowLinker implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String workflowId;
    private String toWorkflowId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public String getToWorkflowId() {
        return toWorkflowId;
    }

    public void setToWorkflowId(String toWorkflowId) {
        this.toWorkflowId = toWorkflowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkflowLinker that = (WorkflowLinker) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (workflowId != null ? !workflowId.equals(that.workflowId) : that.workflowId != null) return false;
        return toWorkflowId != null ? toWorkflowId.equals(that.toWorkflowId) : that.toWorkflowId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (workflowId != null ? workflowId.hashCode() : 0);
        result = 31 * result + (toWorkflowId != null ? toWorkflowId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WorkflowLinker{" +
                "id='" + id + '\'' +
                ", workflowId='" + workflowId + '\'' +
                ", toWorkflowId='" + toWorkflowId + '\'' +
                '}';
    }
}
