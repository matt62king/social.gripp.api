package social.gripp.api.projects.models;

import java.io.Serializable;
import java.util.Set;

public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String owner;
    private String projectName;
    private Set<ProjectRepo> projectRepos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Set<ProjectRepo> getProjectRepos() {
        return projectRepos;
    }

    public void setProjectRepos(Set<ProjectRepo> projectRepos) {
        this.projectRepos = projectRepos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (id != null ? !id.equals(project.id) : project.id != null) return false;
        if (owner != null ? !owner.equals(project.owner) : project.owner != null) return false;
        if (projectName != null ? !projectName.equals(project.projectName) : project.projectName != null) return false;
        return projectRepos != null ? projectRepos.equals(project.projectRepos) : project.projectRepos == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (projectRepos != null ? projectRepos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectRepos=" + projectRepos +
                '}';
    }
}
