package social.gripp.api.projects.models;

import java.io.Serializable;
import java.util.UUID;

public class ProjectRepo implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private UUID projectId;
    private GitHubRepo gitHubRepo;

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

    public GitHubRepo getGitHubRepo() {
        return gitHubRepo;
    }

    public void setGitHubRepo(GitHubRepo gitHubRepo) {
        this.gitHubRepo = gitHubRepo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectRepo that = (ProjectRepo) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        return gitHubRepo != null ? gitHubRepo.equals(that.gitHubRepo) : that.gitHubRepo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (gitHubRepo != null ? gitHubRepo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectRepo{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", gitHubRepo=" + gitHubRepo +
                '}';
    }
}
