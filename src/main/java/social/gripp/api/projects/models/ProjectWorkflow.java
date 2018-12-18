package social.gripp.api.projects.models;

import java.io.Serializable;
import java.util.UUID;

public class ProjectWorkflow implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private UUID projectId;
    private String description;
    private Integer sequence;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getProjectId() {
        return projectId;
    }

    public void setProjectId(UUID projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectWorkflow that = (ProjectWorkflow) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        return sequence != null ? sequence.equals(that.sequence) : that.sequence == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (sequence != null ? sequence.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectWorkflow{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", description='" + description + '\'' +
                ", sequence=" + sequence +
                '}';
    }
}
