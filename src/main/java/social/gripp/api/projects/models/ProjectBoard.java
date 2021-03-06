package social.gripp.api.projects.models;

import java.io.Serializable;

public class ProjectBoard implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String projectId;
    private String description;
    private Boolean masterBoard;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getMasterBoard() {
        return masterBoard;
    }

    public void setMasterBoard(Boolean masterBoard) {
        this.masterBoard = masterBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectBoard that = (ProjectBoard) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return masterBoard != null ? masterBoard.equals(that.masterBoard) : that.masterBoard == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (masterBoard != null ? masterBoard.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectBoard{" +
                "id='" + id + '\'' +
                ", projectId='" + projectId + '\'' +
                ", description='" + description + '\'' +
                ", masterBoard=" + masterBoard +
                '}';
    }
}
