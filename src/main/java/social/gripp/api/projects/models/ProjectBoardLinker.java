package social.gripp.api.projects.models;

import java.io.Serializable;

public class ProjectBoardLinker implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String projectBoardId;
    private String projectWorkflowId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectBoardId() {
        return projectBoardId;
    }

    public void setProjectBoardId(String projectBoardId) {
        this.projectBoardId = projectBoardId;
    }

    public String getProjectWorkflowId() {
        return projectWorkflowId;
    }

    public void setProjectWorkflowId(String projectWorkflowId) {
        this.projectWorkflowId = projectWorkflowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectBoardLinker that = (ProjectBoardLinker) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectBoardId != null ? !projectBoardId.equals(that.projectBoardId) : that.projectBoardId != null)
            return false;
        return projectWorkflowId != null ? projectWorkflowId.equals(that.projectWorkflowId) : that.projectWorkflowId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectBoardId != null ? projectBoardId.hashCode() : 0);
        result = 31 * result + (projectWorkflowId != null ? projectWorkflowId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectBoardLinker{" +
                "id='" + id + '\'' +
                ", projectBoardId='" + projectBoardId + '\'' +
                ", projectWorkflowId='" + projectWorkflowId + '\'' +
                '}';
    }
}
