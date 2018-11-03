package social.gripp.api.projects.models;

import java.io.Serializable;

public class ProjectRepo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String projectId;
    private String prefix;
    private GitHubRepo gitHubRepo;

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

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
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
        if (prefix != null ? !prefix.equals(that.prefix) : that.prefix != null) return false;
        return gitHubRepo != null ? gitHubRepo.equals(that.gitHubRepo) : that.gitHubRepo == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
        result = 31 * result + (gitHubRepo != null ? gitHubRepo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProjectRepo{" +
                "id='" + id + '\'' +
                ", projectId='" + projectId + '\'' +
                ", prefix='" + prefix + '\'' +
                ", gitHubRepo=" + gitHubRepo +
                '}';
    }
}
